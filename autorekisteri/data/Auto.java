//IH 2009
//koodaus UTF-8


package data;

/**
 *
 * @author IH
 */
public class Auto {
    private String rekisterinumero;
    private String merkki;
    private Henkilo omistaja;

    public Auto(String rekisterinumero, String merkki, Henkilo omistaja) {
        this.rekisterinumero = rekisterinumero;
        this.merkki = merkki;
        this.omistaja = omistaja;
    }

    public String getMerkki() {
        return merkki;
    }

    public Henkilo getOmistaja() {
        return omistaja;
    }

    public String getRekisterinumero() {
        return rekisterinumero;
    }

    @Override
    public String toString() {
        return rekisterinumero + " " + merkki + ", Omistaja:" + omistaja;
    }
}
