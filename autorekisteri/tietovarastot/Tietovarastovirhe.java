//IH 2009
//koodaus UTF-8

package tietovarastot;

/**
 *
 * @author IH
 */
public class Tietovarastovirhe extends Exception {

  public Tietovarastovirhe(String viesti, Throwable syy) { 
    super(viesti, syy); 
  }
  public Tietovarastovirhe(Throwable syy) { 
    super(syy); 
  }

  public Tietovarastovirhe(String viesti) {
    super(viesti);
  }
}
