import java.util.Scanner;

public class OlioidenLkm {
	 public static void main(String args[]) {
		    
	       System.out.print("Kuinka monta oliota haluat luoda: ");
	       Scanner lukija = new Scanner(System.in);
	       int lkm = lukija.nextInt();
	       
	       Olio[] olioita = new Olio[lkm];
	       
	       for(int i = 0; i<lkm; i++) {
	           olioita[i] = new Olio();
	       }
	       
	       Olio.olioidenLkm();
	   }
}
