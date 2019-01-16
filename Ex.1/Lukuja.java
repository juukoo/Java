package project_2;

import java.util.Scanner;

public class Lukuja {

	public static void main(String[] args) {
		Scanner syote = new Scanner(System.in);
		int n = 0;
		
		System.out.print("Anna kokonaisluku: ");
		
		
		
		for(n = syote.nextInt(); n >= 0; n--) {
			System.out.println("Et antanut positiivista kokonaislukua.");  
			System.out.println(n + " ");
		}
	}
}

