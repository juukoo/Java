package project_2;

import java.util.Scanner;

public class Taulukoita {
	    public static void main(String[] args) {
	        int rivit, sarakkeet;
	        Scanner lukija = new Scanner(System.in);
	        
	        System.out.print("Anna matriisissa olevien rivien lukum‰‰r‰: ");
	        rivit = lukija.nextInt();
	        System.out.print("Anna matriisissa olevien sarakkeiden lukum‰‰r‰: ");
	        sarakkeet = lukija.nextInt();

	        int matriisi [][];

	        matriisi = kysyTiedot(rivit, sarakkeet);
	        tulostaMatriisi(matriisi);
	        laskeSumma(matriisi);
	    }

	
	private static int[][] kysyTiedot(int rivit, int sarakkeet){
	int matriisi [][] = new int [rivit][sarakkeet];
	Scanner lukija = new Scanner(System.in);
	
		for(int i = 1; i < rivit+1; i++){
			for(int j = 1; j < sarakkeet+1; j++){
				System.out.print("Anna " + i +". rivin " + j +". alkio: ");
				matriisi[i-1][j-1] = lukija.nextInt();
		}	

	}
		return matriisi;				
}		

private static void tulostaMatriisi(int matriisi[][]) {
			System.out.println("\nMatriisi: ");
			for(int i = 0; i < matriisi.length; i++){
				for(int j = 0; j < matriisi[i].length; j++){
					System.out.print(matriisi[i][j]);
					if (j < matriisi[i].length-1) {
						System.out.print("\t");
					}else{
						System.out.print("");
					}
				}
			}
		}
		
		private static void laskeSumma (int matriisi[][]){
			int summa = 0;
			
			for(int i = 0; i < matriisi.length; i++){
				for(int j = 0; j < matriisi[i].length; j++){
					summa += matriisi[i][j];
				}
			}
		System.out.println("\nMatriisin alkioiden summa: " + summa);	
	}
}	
