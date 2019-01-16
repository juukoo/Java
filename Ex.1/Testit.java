package project_1;



public class Testit {
	   public static void main(String [] args) {
	        Luokka ekaOlio = new Luokka();
	        ekaOlio.tulosta();

	        Luokka tokaOlio = new Luokka();
	        tokaOlio.tulosta();

	        Luokka.tulosta();
	    }
	}


	class Luokka {
	    static int laskuri = 0;

	    Luokka() {
	        laskuri++;
	    }

	    public static void tulosta() {
	        System.out.println("Laskurin arvo on: " + laskuri);
	    }
	}
