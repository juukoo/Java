//IH 2009
//koodaus UTF-8

package yhteydenhallinta;
import java.sql.*;
/**
 * 
 * YhteydenHallinta on apuluokka, jonka avulla voit hallita tietokantayhteyden
 * avaamista ja sulkemista sekä sql-lauseen ja tulosjoukon sulkemista.
 *
 * @author IH
 */
public class YhteydenHallinta {

  /**
   * Avaa tietokantayhteyden. 
   * @param ajuri esimerkiksi <code>com.mysql.jdbc.Driver</code>, <code>org.apache.derby.jdbc.EmbeddedDriver</code> tai <code>org.apache.derby.jdbc.ClientDriver</code>
   * @param url esimerkiksi <code>jdbc:derby:kannanNimi</code> tai <code>jdbc:mysql://palvelin/kannanNimi</code>
   * @param kayttajatunnus käyttäjätunnus
   * @param salasana salasana
   * @return yhteys tietokantaan
   * 
   * @throws java.lang.Exception jos ajuria ei löydy tai jos yhteyden avaaminen ei onnistunut
   */
    public static Connection avaaYhteys(String ajuri, String url, String kayttajatunnus, String salasana) throws Exception {
      try {
        Class.forName(ajuri).newInstance();
        return DriverManager.getConnection(url, kayttajatunnus, salasana);
      }
      catch (SQLException sqle) {
        throw new Exception("Yhteyden avaaminen ei onnistunut", sqle);
      }
      catch (ClassNotFoundException e) {
        throw new Exception("Ajuria ei löytynyt", e);
      }
    }

    /**
     * Sulkee yhteyden.
     * @param yhteys suljettava yhteys
     * @return <code>true</code>, jos yhteyden sulkeminen onnistui muuten
     * <code>false</code>.
     */
    public static boolean suljeYhteys(Connection yhteys) {
      if (yhteys!=null) {
        try {
          yhteys.close();
          return true;
        }
        catch (SQLException sqle) {
          return false;
        }
      }
      else {
        return false;
      }
    }

    /**
     * Sulkee sql-lauseen.
     * @param suljettavaLause suljettava sql-lauseolio.
     * @return palauttaa <code>true</code>, jos sulkeminen onnistui ja 
     * <code>false</code> muuten.
     */
    public static boolean suljeLause(Statement suljettavaLause) {
      if (suljettavaLause!=null) {
        try {
          suljettavaLause.close();
          return true;
        }
        catch (SQLException sqle) {
          return false;
        }
      }
      return false;
    }
    
     /**
     * Sulkee tulosjoukon.
     * @param suljettavaTulosjoukko suljettava ResultSet-olio.
     * @return palauttaa <code>true</code>, jos sulkeminen onnistui ja 
     * <code>false</code> muuten.
     */
    public static boolean suljeTulosjoukko(ResultSet suljettavaTulosjoukko) {
      if (suljettavaTulosjoukko!=null) {
        try {
          suljettavaTulosjoukko.close();
          return true;
        }
        catch (SQLException sqle) {
          return false;
        }
      }
      return false;
    }
}
