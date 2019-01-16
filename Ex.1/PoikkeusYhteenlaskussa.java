import java.util.Scanner; 
import java.util.*; 

public class PoikkeusYhteenlaskussa { 
    public static void main(String[] args) { 
        Scanner lukija = new Scanner(System.in); 
        int ekaLuku = 0, tokaLuku = 0, vastaus; 
        boolean syöteOikein = true; 

        // Tähän tulee sinun kirjoittama koodi 
       
        try{
            System.out.print("Anna eka luku: ");
             ekaLuku = lukija.nextInt();
            
            System.out.print("Anna toka luku: ");
             tokaLuku = lukija.nextInt();
            }catch(InputMismatchException p){
            	syöteOikein = false;
            	
            }
        
    
        if(syöteOikein == true) { 
            vastaus = ekaLuku + tokaLuku; 
            System.out.println("Tulos: " + vastaus); 
        } else { 
            System.out.println("Et antanut kokonaislukua!");
        }  
    } 
} 