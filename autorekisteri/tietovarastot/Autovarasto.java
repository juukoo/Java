//IH 2009
//koodaus UTF-8


package tietovarastot;

/**
 *
 * @author IH
 */
import yhteydenhallinta.YhteydenHallinta;
import data.Auto;
import data.Henkilo;
import java.sql.*;
import java.util.*;

/**
 *
 * @author helil
 */
public class Autovarasto {

  private String ajuri;
  private String url;
  private String kayttajatunnus;
  private String salasana;
  //sql-lauseet 
  
  private String sqlHaeAuto="select rekisterinumero,merkki,henkilotunnus,"+
          "etunimi,sukunimi from auto,henkilo where omistaja=henkiloID and"+
          " rekisterinumero=?";
  private String sqlLisaaAuto="insert into auto (rekisterinumero,merkki,"+
          "omistaja) values(?,?,?)";
  private String sqlHaeKaikkiAutot="select rekisterinumero,merkki," +
          "henkilotunnus,etunimi,sukunimi from auto,henkilo " +
          "where omistaja=henkiloID";
  private String sqlOmistajanMuutos="update auto set omistaja=? " +
          "where rekisterinumero=?";
  
  private Henkilovarasto henkilot;
  
  Autovarasto(String ajuri, String url, String kayttajatunnus, String salasana, Henkilovarasto henkilot) {
    this.ajuri=ajuri;
    this.url=url;
    this.kayttajatunnus=kayttajatunnus;
    this.salasana=salasana;
    this.henkilot=henkilot;
  }
  
  Auto haeAuto(String rekisterinumero) throws Tietovarastovirhe {
    Connection yhteys=null;
    try {
      yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
    }
    catch (Exception e) {
      throw new Tietovarastovirhe("Tietovarasto ei ole auki", e);
    }
    PreparedStatement haeAuto=null;
    ResultSet tulos=null;
    try {
      haeAuto=yhteys.prepareStatement(sqlHaeAuto);
      haeAuto.setString(1, rekisterinumero);
      tulos=haeAuto.executeQuery();
      if (tulos.next()) {
        return new Auto(tulos.getString(1),
                        tulos.getString(2),
                        new Henkilo(tulos.getString(3),
                                    tulos.getString(4),
                                    tulos.getString(5)));
      }
      else {
        return null;
      }
    }
    catch (SQLException sqle) {
      throw new Tietovarastovirhe("Autoa ei löytynyt", sqle);
    }
    finally {
      YhteydenHallinta.suljeTulosjoukko(tulos);
      YhteydenHallinta.suljeLause(haeAuto);
      YhteydenHallinta.suljeYhteys(yhteys);
    }
  }

  void lisaaAuto(Auto uusiAuto) throws Tietovarastovirhe { 
    Connection yhteys=null;
    try {
      yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
    }
    catch (Exception e) {
      throw new Tietovarastovirhe("Tietovarasto ei ole auki", e);
    }
    PreparedStatement autonlisays=null;
    try {
      if(haeAuto(uusiAuto.getRekisterinumero())==null) {
        autonlisays=yhteys.prepareStatement(sqlLisaaAuto);
        int henkiloId=henkilot.haeHenkiloId(uusiAuto.getOmistaja().getHenkilotunnus());
        if(henkiloId>=0) {
          autonlisays.setString(1, uusiAuto.getRekisterinumero());
          autonlisays.setString(2, uusiAuto.getMerkki());
          autonlisays.setInt(3, henkiloId);
          autonlisays.executeUpdate();
        }
        else {
          throw new Tietovarastovirhe("Omistajaa ei löytynyt. Auton lisäys ei onnistunut");
        }
      }
    }
    catch (SQLException sqle) {
      throw new Tietovarastovirhe("Auton lisäys ei onnistunut", sqle);
    }
    finally {
      YhteydenHallinta.suljeLause(autonlisays);
      YhteydenHallinta.suljeYhteys(yhteys);
    }
  }

  List<Auto> haeKaikkiAutot() throws Tietovarastovirhe {
    Connection yhteys=null;
    try {
      yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
    }
    catch (Exception e) {
      throw new Tietovarastovirhe("Tietovarasto ei ole auki", e);
    }
    PreparedStatement haeKaikkiAutot= null;
    ResultSet tulos= null;
    try {
      List<Auto> apulista=new ArrayList<Auto>();
      haeKaikkiAutot=yhteys.prepareStatement(sqlHaeKaikkiAutot);
      tulos=haeKaikkiAutot.executeQuery();
      while (tulos.next()) {
         apulista.add(new Auto( tulos.getString(1),
                                tulos.getString(2),
                                new Henkilo(tulos.getString(3),
                                            tulos.getString(4),
                                            tulos.getString(5))));
      }
      return apulista;
    }
    catch (SQLException sqle) {
      throw new Tietovarastovirhe("Autojen haku epäonnistui", sqle);
    }
    finally {
      YhteydenHallinta.suljeTulosjoukko(tulos);
      YhteydenHallinta.suljeLause(haeKaikkiAutot);
      YhteydenHallinta.suljeYhteys(yhteys);
    }
  }


  void vaihdaOmistaja(Auto vanhaAuto, Henkilo uusiOmistaja) throws Tietovarastovirhe {
    Connection yhteys=null;
    try {
      yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
    }
    catch (Exception e) {
      throw new Tietovarastovirhe("Tietovarasto ei ole auki", e);
    }
    PreparedStatement omistajanmuutos=null;
    try{
      if(haeAuto(vanhaAuto.getRekisterinumero())!=null) {
        omistajanmuutos=yhteys.prepareStatement(sqlOmistajanMuutos);
        int uusiOmistajaId=henkilot.haeHenkiloId(uusiOmistaja.getHenkilotunnus());
        if(uusiOmistajaId>=0) {
          omistajanmuutos.setInt(1, uusiOmistajaId);
          omistajanmuutos.setString(2, vanhaAuto.getRekisterinumero());
          omistajanmuutos.executeUpdate();
        }
        else {
          throw new Tietovarastovirhe("Omistajan muutos ei onnistunut");
        }
      }
      else {
        throw new Tietovarastovirhe("Autoa ei ole kannnassa");
      }
    }
    catch(SQLException sqle) {
      throw new Tietovarastovirhe("Omistajan muutos ei onnistunut"+sqle);
    }
    finally {
      YhteydenHallinta.suljeLause(omistajanmuutos);
      YhteydenHallinta.suljeYhteys(yhteys);
    }
  }
}