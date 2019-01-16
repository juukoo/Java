package project_2;

import java.util.Scanner;

public class Valuuttamuunnin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dollari = 0.75;
		double euro = 10.0;
		double adollari = 13.33;
		
		Scanner syote = new Scanner(System.in);
		
		System.out.println("------------");
		System.out.println("Valuuttamuunnin");
		System.out.println("------------");
		
		System.out.print("Anna dollarin kurssi euroina: ");
						dollari = syote.nextDouble();
		System.out.print("Anna rahan m‰‰r‰ euroina: ");
						euro = syote.nextDouble();
	    adollari = euro / dollari;
						
		System.out.println("Rahan arvo dollareina: " +adollari);
		
		System.out.printf("%.2f", adollari);

	}

}
