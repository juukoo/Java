package project_1;

import java.util.Scanner;

public class Taulukko {

	public static void main(String[] args){

		
	Scanner syote = new Scanner(System.in);
		
int arvosana = 0;
int maara = 0;
int summa = 0;	
double keskiarvo = 0;


System.out.print("Ohjelma laskee syötettyjen arvosanojen keskiarvon. \nLopetus negatiivisella kokonaisluvulla.\n\n");


do {
	System.out.print("Anna arvosana (4-10): ");
	arvosana = syote.nextInt();
	maara++;
	String line = syote.nextLine();
	syote = new Scanner(line);
	while (syote.hasNextInt()){
	maara = syote.nextInt();
		summa +=maara;
	}
	
	if(arvosana > 0 && arvosana < 4 || arvosana > 10){
	System.out.print("Antamasi arvosana ei kelpaa!\n");
	maara--;	
	}
	
	

}while(arvosana > 0 );	
 maara--;

 keskiarvo = summa / maara;

System.out.print("Syötetty "+ maara +" arvosanaa. \nArvosanojen keskiarvo: " +keskiarvo);


}		
}	