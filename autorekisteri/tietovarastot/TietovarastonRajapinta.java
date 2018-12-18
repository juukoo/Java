//IH 2009
//koodaus UTF-8


package tietovarastot;

/**
 *
 * @author helil
 */
import data.Auto;
import data.Henkilo;
import java.util.*;

/**
 *
 * @author IH
 */
public class TietovarastonRajapinta {

  private String ajuri=Yhteystiedot.getAjuri();
  private String url=Yhteystiedot.getUrl();
  private String kayttaja=Yhteystiedot.getKayttajatunnus();
  private String salasana=Yhteystiedot.getSalasana();
  
  private Henkilovarasto henkilot=new Henkilovarasto(ajuri,url,kayttaja,salasana);
  private Autovarasto autot=new Autovarasto(ajuri,url,kayttaja,salasana, henkilot);
  
  public void lisaaHenkilo(Henkilo uusiHenkilo) throws Tietovarastovirhe {
   henkilot.lisaaHenkilo(uusiHenkilo);
  }

  public Henkilo haeHenkilo(String henkilotunnus) throws Tietovarastovirhe {
    return henkilot.haeHenkilo(henkilotunnus);
  }

  public List<Henkilo> haeKaikkiHenkilot() throws Tietovarastovirhe {
    return henkilot.haeKaikkiHenkilot();
  }

  public Auto haeAuto(String rekisterinumero) throws Tietovarastovirhe {
    return autot.haeAuto(rekisterinumero);
  }

  public void lisaaAuto(Auto uusiAuto) throws Tietovarastovirhe { 
    autot.lisaaAuto(uusiAuto);
  }

  public List<Auto> haeKaikkiAutot() throws Tietovarastovirhe {
    return autot.haeKaikkiAutot();
  }
  
  public void vaihdaOmistaja(Auto vanhaAuto, Henkilo uusiOmistaja) throws Tietovarastovirhe {
    autot.vaihdaOmistaja(vanhaAuto, uusiOmistaja);
  }
}