package project_1;

import java.util.Scanner;

public class noname{
	public static void main(String[] args){
		Scanner syote = new Scanner(System.in);
		
		System.out.print("Anna luku: ");
		int luku = syote.nextInt();
		laske(luku);
		
		}
		 static void laske(int luku){
			for(int i = 1; i<=10; i++){

				
				System.out.println((i*luku ));
		}	
	}		
}