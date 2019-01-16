package project_2;

import java.util.Scanner;

public class Arvauspeli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String paiva;  
			Scanner syote = new Scanner(System.in);
			
			//Kysyy
			System.out.println("Anna viikonpäivä ");
				paiva = syote.nextLine();
			//Vertaa
			if (paiva.equals("lauantai") || paiva.equals("sunnuntai")){
				System.out.println("On viikonloppu!");
			}
			else
				System.out.println("Ei ole viikonloppu.");
			
	}

}
