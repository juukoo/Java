package project_2;

import java.util.Scanner;

public class Aamutoimet {

	public static void main(String[] args) {
		Scanner syote = new Scanner(System.in);
		
		System.out.println("Oletko syönyt aamupalan?");
		boolean aamupala = syote.nextBoolean();
		System.out.println("Oletko käynyt peusulla?");
		boolean peseytyminen = syote.nextBoolean();
		System.out.println("Oletko pakannut laukun?");
		boolean pakkaaminen = syote.nextBoolean();
		
		boolean kouluun;
		if(aamupala && peseytyminen && pakkaaminen){
			System.out.println("Terve menoa kouluun!");
		}else
		
		System.out.println("Äläs lähde vielä, jotain puuttuu!");
		
		
		
	}

}
