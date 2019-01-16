package project_2;

import java.util.Scanner;

public class PinKoodi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int luku = 0;
		
		Scanner syote = new Scanner(System.in);
		
		System.out.println("Anna Pin-koodi: ");
		luku = syote.nextInt();
		while (luku != 3120){
			System.out.println("\nV‰‰r‰ Pin-koodi!");
			System.out.print("\nAnna Pin-koodi: ");
			luku = syote.nextInt();
		}
		System.out.println("\nPin-koodi oikein!");
	}

}

