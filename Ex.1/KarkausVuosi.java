package project_2;

import java.util.Scanner;

public class KarkausVuosi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner syote = new Scanner(System.in);
		//kysyy
		System.out.println("Anna vuosiluku.");
		int vuosiluku = syote.nextInt();
		
		//laskee
		if(vuosiluku % 400 == 0 || (vuosiluku % 4 == 0 && vuosiluku % 100 != 0)){
			System.out.println("Vuosi oli/on karkausvuosi.");
		} else {
			System.out.println("Vuosi ei ollut/ole karkausvuosi.");
		}
	}

}
