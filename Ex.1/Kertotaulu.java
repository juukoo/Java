package project_2;

import java.util.Scanner;

public class Kertotaulu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner syote = new Scanner(System.in);
		System.out.println("Anna luku: ");
		int luku = syote.nextInt();
		
		for (int i = 1; i <= 50; i++){
			
			
		//	System.out.println(i*luku);
			System.out.println(i+ "*" + luku + " = " + i*luku);
		}
		

	}

}
