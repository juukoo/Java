package project_2;

import java.util.Scanner;

public class IloinenVaiSurullinen {

	public static void main(String[] args) {
		Scanner syote = new Scanner(System.in);
		
		System.out.print("Kuinkan vanha olet: ");
		int ika = syote.nextInt();
		
		if(ika <= 18){
			System.out.println("Olet alaik�inen");
		}else
			System.out.println("Olet t�ysi-ik�inen");

	}

}
