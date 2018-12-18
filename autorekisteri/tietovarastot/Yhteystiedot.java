//IH 2009
//koodaus UTF-8

package tietovarastot;

/**
 *Luokka simuloi käyttäjätietojen pyytämistä käyttäjältä tms.
 * @author IH
 */
public class Yhteystiedot {
  static String getAjuri() {
    return "org.apache.derby.jdbc.EmbeddedDriver";
  } 
  
  static String getUrl() {
    return "jdbc:derby:autot";
  }
  
  static String getKayttajatunnus() {
    return "saku";
  }
  
  static String getSalasana() {
    return "salainen";
  }

}
