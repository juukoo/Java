package project_1;

import java.util.Scanner;

public class Testii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int luku1, luku2, luku3, suurin, pienin;
		Scanner syote = new Scanner(System.in);
		
		System.out.print("Syötä ensimmäinen kokonaisluku: ");
		luku1 = syote.nextInt();
		
		System.out.print("Syötä toinen kokonaisluku: ");
		luku2 = syote.nextInt();
		
		System.out.print("Syötä kolmas kokonaisluku: ");
		luku3 = syote.nextInt();
		
		suurin = suurin(luku1, luku2, luku3);
		pienin = pienin(luku1, luku2, luku3);
		
		System.out.print("Syöttämistäsi luvuista suurin oli " + suurin);
		System.out.println(" ja pienin " + pienin);
	}

	private static int min(int a, int b) {
		// TODO Auto-generated method stub
		if (a < b) return a;
		else return b;
	}
	
	private static int pienin(int luku1, int luku2, int luku3) {
		// TODO Auto-generated method stub
		return min(luku1, min(luku2, luku3));
	}

	private static int max(int a, int b) {
		// TODO Auto-generated method stub
		if (a > b) return a;
		else return b;
	}
	private static int suurin(int luku1, int luku2, int luku3) {
		// TODO Auto-generated method stub
		return max(luku1, max(luku2, luku3));
	}

}
