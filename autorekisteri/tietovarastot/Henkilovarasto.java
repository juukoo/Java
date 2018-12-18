//IH 2009
//koodaus UTF-8

package tietovarastot;

import yhteydenhallinta.YhteydenHallinta;
import data.Henkilo;
import java.sql.*;
import java.util.*;

/**
 *
 * @author IH
 */
public class Henkilovarasto {
  //näitä ei normaalisti pidä kovakoodata tänne!
  private String ajuri;
  private String url;
  private String kayttaja;
  private String salasana;
  //sql-lauseet 
  private String sqlHaeHenkilo="select henkilotunnus,etunimi,"+
          "sukunimi from henkilo where henkilotunnus=?";
  private String sqlHaeKaikkiHenkilot="select henkilotunnus,etunimi,"+
          "sukunimi from henkilo";
  private String sqlHaeHenkilonID="select henkiloID from henkilo "+
          "where henkilotunnus=?";

  private String sqlLisaaHenkilo="insert into henkilo (henkiloID, "+
          "henkilotunnus, etunimi,sukunimi) select (coalesce(max(henkiloID)+1,0)),?,?,? from henkilo";
  
  private String sqlPoistaHenkilo="delete from henkilo where henkilotunnus=?";
  private String sqlMuutaHenkilonTietoja="update henkilo set etunimi=?, sukunimi=? WHERE henkilotunnus=?";

  public Henkilovarasto(String ajuri, String url, String kayttaja, String salasana) {
    this.ajuri=ajuri;
    this.url=url;
    this.kayttaja=kayttaja;
    this.salasana=salasana;
  }


  //hakee henkilötunnusta vastaavan ID:n. Palauttaa -1 jos ei löydy.
  int haeHenkiloId(String henkilotunnus) {
    Connection yhteys=null;
    PreparedStatement haeHenkiloId=null;
    ResultSet tulos=null;
    try {
      yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, kayttaja, salasana);
      haeHenkiloId=yhteys.prepareStatement(sqlHaeHenkilonID);
      haeHenkiloId.setString(1, henkilotunnus);
      tulos=haeHenkiloId.executeQuery();
      if (tulos.next()) {
        return tulos.getInt(1);
      }
      else {
        return 0;
      }
    }
    catch (Exception e) {
      return -1;
    }
    finally {
      YhteydenHallinta.suljeTulosjoukko(tulos);
      YhteydenHallinta.suljeLause(haeHenkiloId);
      YhteydenHallinta.suljeYhteys(yhteys);
    }
  }

  public void lisaaHenkilo(Henkilo uusiHenkilo) throws Tietovarastovirhe {
    int henkiloid=haeHenkiloId(uusiHenkilo.getHenkilotunnus());
    if (henkiloid==0) {
       Connection yhteys=null;
       try {
        yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, kayttaja, salasana);
      }
      catch (Exception e) {
        throw new Tietovarastovirhe("Tietovarasto ei ole auki", e);
      }
      PreparedStatement henkilonlisays=null;
      try {
        henkilonlisays=yhteys.prepareStatement(sqlLisaaHenkilo);
        henkilonlisays.setString(1, uusiHenkilo.getHenkilotunnus());
        henkilonlisays.setString(2, uusiHenkilo.getEtunimi());
        henkilonlisays.setString(3, uusiHenkilo.getSukunimi());
        henkilonlisays.executeUpdate();
      }
      catch (SQLException sqle) {
        sqle.printStackTrace();
        throw new Tietovarastovirhe("Henkilön lisäys ei onnistunut", sqle);
      }
      finally {
        YhteydenHallinta.suljeLause(henkilonlisays);
        YhteydenHallinta.suljeYhteys(yhteys);
      }
    }
    else {
      if(henkiloid>0) {
        throw new Tietovarastovirhe("Henkilö on jo lisätty"); 
      }
      else {
        throw new Tietovarastovirhe("Henkilön lisäys ei onnistunut"); 
      }     
    }
  }

  public Henkilo haeHenkilo(String henkilotunnus) throws Tietovarastovirhe {
    Connection yhteys=null;
    try {
      yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, kayttaja, salasana);
    }
    catch (Exception e) {
      throw new Tietovarastovirhe("Tietovarasto ei ole auki", e);
    }
    PreparedStatement haeHenkilo=null;
    ResultSet tulos=null;
    try {
      haeHenkilo=yhteys.prepareStatement(sqlHaeHenkilo);
      haeHenkilo.setString(1, henkilotunnus);
      tulos=haeHenkilo.executeQuery();
      if (tulos.next()) {
        return new Henkilo(tulos.getString(1),
                           tulos.getString(2),
                           tulos.getString(3));
      }
      else {
        throw new Tietovarastovirhe("Henkilöä ei löytynyt");
      }
    }
    catch (SQLException sqle) {
      throw new Tietovarastovirhe("Henkilon hakuvirhe", sqle);
    }
    finally {
      YhteydenHallinta.suljeTulosjoukko(tulos);
      YhteydenHallinta.suljeLause(haeHenkilo);
      YhteydenHallinta.suljeYhteys(yhteys);
    }
  }

  public List<Henkilo> haeKaikkiHenkilot() throws Tietovarastovirhe {
    Connection yhteys=null;
    try {
      yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, kayttaja, salasana);
    }
    catch (Exception e) {
      throw new Tietovarastovirhe("Tietovarasto ei ole auki", e);
    }
    PreparedStatement haeKaikkiHenkilot=
            null;
    ResultSet tulos=
            null;
    try {
      List<Henkilo> apulista=new ArrayList<Henkilo>();
      haeKaikkiHenkilot=yhteys.prepareStatement(sqlHaeKaikkiHenkilot);
      tulos=haeKaikkiHenkilot.executeQuery();
      while (tulos.next()) {
        apulista.add(new Henkilo(tulos.getString(1),
                                 tulos.getString(2),
                                 tulos.getString(3)));
      }
      return apulista;
    }
    catch (SQLException sqle) {
      throw new Tietovarastovirhe("Henkilon haku epäonnistui", sqle);
    }
    finally {
      YhteydenHallinta.suljeTulosjoukko(tulos);
      YhteydenHallinta.suljeLause(haeKaikkiHenkilot);
      YhteydenHallinta.suljeYhteys(yhteys);
    }
  }

  public void poistaHenkilo(String henkilotunnus) throws Tietovarastovirhe {
    Connection yhteys=null;
    try {
      yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, kayttaja, salasana);
    }
    catch (Exception e) {
      throw new Tietovarastovirhe("Tietovarasto ei ole auki", e);
    }

    PreparedStatement poistaHenkilo=null;
    try {
      poistaHenkilo=yhteys.prepareStatement(sqlPoistaHenkilo);
      poistaHenkilo.setString(1, henkilotunnus);
      poistaHenkilo.executeUpdate();
    }
    catch (SQLException sqle) {
      throw new Tietovarastovirhe("Henkilön poistaminen ei onnistunut", sqle);
    }
    finally {
      YhteydenHallinta.suljeLause(poistaHenkilo);
      YhteydenHallinta.suljeYhteys(yhteys);
    }
  }

  public void muutaHenkilonTietoja(Henkilo muutettuHenkilo) throws Tietovarastovirhe {
    Connection yhteys=null;
    try {
      yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, kayttaja, salasana);
    }
    catch (Exception e) {
      throw new Tietovarastovirhe("Tietovarasto ei ole auki", e);
    }
    PreparedStatement muutaHenkilonTietoja=null;
    try {
      muutaHenkilonTietoja=yhteys.prepareStatement(sqlMuutaHenkilonTietoja);
      muutaHenkilonTietoja.setString(1, muutettuHenkilo.getEtunimi());
      muutaHenkilonTietoja.setString(2, muutettuHenkilo.getSukunimi());
      muutaHenkilonTietoja.setString(3, muutettuHenkilo.getHenkilotunnus());
      muutaHenkilonTietoja.executeUpdate();
    }
    catch (SQLException sqle) {
      throw new Tietovarastovirhe("Henkilön tietojen muuttaminen ei onnistunut", sqle);
    }
    finally {
      YhteydenHallinta.suljeLause(muutaHenkilonTietoja);
      YhteydenHallinta.suljeYhteys(yhteys);
    }
  }
}