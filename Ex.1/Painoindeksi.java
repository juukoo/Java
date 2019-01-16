package project_1;


import java.util.Scanner;

public class Painoindeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tulostus
		System.out.println("------------");
		System.out.println("Painoindeksilaskuri");
		System.out.println("------------");
		
		double paino = 0;
		double pituus = 0;
		double bmi = 0;
			
		Scanner syote = new Scanner(System.in);
		
		//Kysy paino
		System.out.print("Anna painosi: ");
		  		paino = syote.nextDouble();
		//Kysy pituus  		
		System.out.print("Anna Pituutesi: (m)");
		  		pituus = syote.nextDouble();
		//Laske BMI
		bmi = paino / (pituus * pituus);

		System.out.print("Painoindeksinne on "+bmi);
	}

}
