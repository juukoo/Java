package project_2;

import java.util.Scanner;

public class Henkilotietotulostaja {

	public static void main(String[] args) {
		Scanner syote = new Scanner(System.in);
		int vuosiNyt = 2017;
		System.out.println("SY�T� HENKIL�NTIEDOT");
		System.out.println("--------------------");

		System.out.print("Anna etunimet: ");
		String etunimi = syote.nextLine();
		System.out.print("Anna sukunimi: ");
		String sukunimi = syote.nextLine();
		System.out.print("Anna puhelinnumero: ");
		String puhnro = syote.nextLine();
		System.out.print("Anna s�hk�postiosoite: ");
		String sposti = syote.nextLine();
		System.out.print("Anna l�hiosoite: ");
		String osoite = syote.nextLine();
		System.out.print("Anna postinumero: ");
		String postinro = syote.nextLine();
		
		System.out.print("Anna kaupunki: ");
		String kaupunki = syote.nextLine();
		System.out.print("Anna maa: ");
		String maa = syote.nextLine();
		
		System.out.print("Anna syntym�vuosi: ");
		int syntym�vuosi = syote.nextInt();
		
		System.out.println("KIITOS!");
		
		System.out.println("HENKIL�N TIEDOT");
		System.out.println("---------------");
		
		System.out.println("NIMI: \n" +"  "+sukunimi+","+etunimi );
		System.out.println("PUH: \n" +"  "+puhnro);
		System.out.println("E-MAIL: \n" +"  "+sposti);
		System.out.println("OSOITE: \n" + "  "+osoite+"\n" +"  "+postinro+"\n" +"  "+maa);
		System.out.println("Ik�: "+(vuosiNyt - syntym�vuosi));
	}

}
