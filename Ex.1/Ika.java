package project_2;

import java.util.Scanner;

public class Ika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Kysy ika
		System.out.println("Anna ikasi: ");
		Scanner syote = new Scanner(System.in);
		int ika = syote.nextInt();
		//Tutki ika
		if (ika < 18){
			System.out.println("Olet alaik�inen!");
		}
		else {
			System.out.println("Olet t�ysik�inen!");
		}
		//Tulosta
	}

}
