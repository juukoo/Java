import java.util.*; 

public class poikkeusTaulukossa { 
     
    public static void main(String[] args) { 
        Scanner lukija = new Scanner(System.in); 
        int monesAlkio = 0; 
        boolean syöteOikein = true; 
        int[] taulukko = {4,5,8,9,1,32,5,8,32,7,9,5}; 

        System.out.print("Mones taulukon alkio tulostetaan? ");
        
        try{
            monesAlkio = lukija.nextInt();
            }catch(InputMismatchException p){
            	syöteOikein = false;
            	
            }catch(ArrayIndexOutOfBoundsException p2){
            	syöteOikein = false;
            	System.out.println("Virheellinen indeksi!");
            }
    
        	
        
        if(syöteOikein == true) { 
            System.out.println(taulukko[monesAlkio]); 
        } else { 
        System.out.println("Et antanut kokonaislukua!");
        }
    } 
} 
    
    

