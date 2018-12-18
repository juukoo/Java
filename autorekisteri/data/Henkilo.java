//IH 2009
//UTF-8

package data;

/**
 *
 * @author IH
 */
public class Henkilo {
  private String henkilotunnus;
  private String etunimi;
  private String sukunimi;

  public Henkilo(String henkilotunnus, String etunimi, String sukunimi) {
    this.henkilotunnus=henkilotunnus;
    this.etunimi=etunimi;
    this.sukunimi=sukunimi;
  }

  public String getEtunimi() {
    return etunimi;
  }

  public String getHenkilotunnus() {
    return henkilotunnus;
  }

  public String getSukunimi() {
    return sukunimi;
  }

  @Override
  public String toString() {
    return etunimi+" "+sukunimi;
  }

  @Override
  public boolean equals(Object verrattavaHenkilo) {
    if (verrattavaHenkilo==null) {
      return false;
    }
    if (getClass()!=verrattavaHenkilo.getClass()) {
      return false;
    }
    final Henkilo other=(Henkilo) verrattavaHenkilo;
    if (this.henkilotunnus!=other.henkilotunnus&&(this.henkilotunnus==null||!this.henkilotunnus.equals(other.henkilotunnus))) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int hajautusavain=7;
    hajautusavain=41*hajautusavain+(this.henkilotunnus!=null?this.henkilotunnus.hashCode():0);
    return hajautusavain;
  }
  
  
}
