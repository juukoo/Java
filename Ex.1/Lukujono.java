package project_2;

import java.util.Scanner;

public class Lukujono {

	public static void main(String[] args) {
		Scanner syote = new Scanner(System.in);
		
		System.out.print("Anna ensimmäinen luku? ");
		int ekaLuku = syote.nextInt();
		System.out.print("Anna toinen luku? ");
		int tokaLuku = syote.nextInt();
		
		if(ekaLuku > tokaLuku){
			System.out.println("LUKUJONO a) :");
			for (int j = ekaLuku; j > tokaLuku-1; j--){
				System.out.print(j+", ");
			}
			
		}else
			System.out.println("LUKUJONO a) :");
		for (int i = ekaLuku; i < tokaLuku+1; i++){
			System.out.print(i+", ");
		}
		if(ekaLuku < tokaLuku){
			System.out.print("\nLUKUJONO b) :"+"\n" );
			for (int i = ekaLuku ; i < tokaLuku+1; i +=2){
				System.out.print(i+", ");
			}
		}else
		System.out.print("\nLUKUJONO b) :"+"\n" );
		for (int j = ekaLuku; j > tokaLuku-1; j -=2){
			System.out.print(j+", ");
		
		}
	}

}
