package project_2;

import java.util.Scanner;

public class Arvauspeli2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
			Scanner syote = new Scanner(System.in);
			//int oikeavastaus = 12;
			int oikeavastaus =  (int)(Math.random()*10);
			
			//Kysyy
			System.out.println("Arvaa luku ");
				int luku = syote.nextInt();
			//Vertaa
			if (oikeavastaus == luku ){
				System.out.println("Oikein!");
			}else {
				if (luku > oikeavastaus){
					System.out.println("Arvasit liian suuren!");
				}else {
					System.out.println("Arvasit liian pienen!");
		
				}
			}
		}	

}