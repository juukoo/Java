package project_1;

import java.io.*;
import java.util.Scanner;

public class Ylikuormittaminen {
    	 public static void main (String [] args) {
    	      double nopeus, matka, aika;

    	        matka = kysyMatka();
    	        nopeus = kysyNopeus();
    	        aika = laskeAika(matka, nopeus);

    	        System.out.println("Matkaasi kuluu aikaa " + aika + " tuntia.");
    	    }

    	  
    	private static double laskeAika(double matka, double nopeus) {
			double aika = (matka / nopeus);
			return aika;
		}


		private static double kysyNopeus() {
			Scanner syote = new Scanner(System.in);
			double nopeus = 0;
			System.out.println("Mikä on keskinopeutesi (km/h): ");
			nopeus = syote.nextDouble();
			return nopeus;
		}

		private static double kysyMatka() {
			Scanner syote = new Scanner(System.in);
			double matka = 0;
			System.out.println("Mikä on matkan pituus (km): ");
			matka = syote.nextDouble();
			return matka;
		}
}