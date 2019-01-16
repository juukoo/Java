package project_2;

import java.util.Scanner;

public class LeffanTiedot {

	public static void main(String[] args) {
		Scanner syote = new Scanner(System.in);
		
		System.out.println("Mik‰ on elokuvan nimi?");
		String elokuvanNimi = syote.nextLine();
		System.out.println("Kuka elokukan ohjasi?");
		String ohjaaja = syote.nextLine();
		System.out.println("Min‰ vuonna elokuva valmistui?");
		int julkaisu = syote.nextInt();
		System.out.println("Min‰ vuonna olet syntynyt?");
		int syntymavuosi = syote.nextInt();
		
		
		
		System.out.print("ELOKUVAN TIEDOT:\n ");
		System.out.println("\t"+elokuvanNimi+" " + "("+julkaisu+")");
		System.out.println("\tOhjaus: "+"\""+ohjaaja+"\"");
		
		if(syntymavuosi > julkaisu){
		System.out.println("\tElokuva julkaistiin "+(syntymavuosi - julkaisu)+" vuotta ennen syntym‰‰si!");
		}else
			System.out.println("\tElokuvan ilmestyess‰ olit "+(julkaisu - syntymavuosi)+" vuotta!");
	}

}
