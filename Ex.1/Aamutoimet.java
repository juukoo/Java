package project_2;

import java.util.Scanner;

public class Aamutoimet {

	public static void main(String[] args) {
		Scanner syote = new Scanner(System.in);
		
		System.out.println("Oletko sy�nyt aamupalan?");
		boolean aamupala = syote.nextBoolean();
		System.out.println("Oletko k�ynyt peusulla?");
		boolean peseytyminen = syote.nextBoolean();
		System.out.println("Oletko pakannut laukun?");
		boolean pakkaaminen = syote.nextBoolean();
		
		boolean kouluun;
		if(aamupala && peseytyminen && pakkaaminen){
			System.out.println("Terve menoa kouluun!");
		}else
		
		System.out.println("�l�s l�hde viel�, jotain puuttuu!");
		
		
		
	}

}
