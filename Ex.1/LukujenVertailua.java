package project_2;

import java.util.Scanner;

public class LukujenVertailua {

	public static void main(String[] args) {
		Scanner syote = new Scanner(System.in);
		
		System.out.print("Anna ik�si: ");
		int ika = syote.nextInt();
		
		if(ika < 0 || ika > 150){
			System.out.println("Virheellinen ik�!");
		}else if(ika <= 6){
			System.out.println("Esikoululainen");	
		}else if(ika == 14){
			System.out.println("Haastava ik�");	
		}else if(ika >= 16 && ika <= 18){
			System.out.println("L�hes aikuinen");
		}else if(ika >= 30 && ika < 45){
			System.out.println("Olet keski-i�ss�");
		}else if(ika > 45 && ika < 65){
			System.out.println("Viel� ehtii ennen el�kett�!");
		}else if(ika >= 7 && ika <= 15){
			System.out.println("Koululainen");
		}else if(ika >= 19 && ika <= 29){
			System.out.println("Aikuinen");
		}else 
			System.out.print("Olet el�kel�inen");
	}

}
