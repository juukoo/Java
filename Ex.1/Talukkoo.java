package project_1;

import java.util.Scanner;

public class Talukkoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String[] kaupungit = {"Pariisi", "Milano", "Tel Aviv", "Istanbul", "Sydney", "Milano", "Mumbai"};	
	
	for (int i = 0; i < kaupungit.length ; i++){
	System.out.println(i+1+ ". " +kaupungit[i]);
	}
	// 	String[] taulukko = new String[20];
	//		taulukko[0] = "Vantaa";
	//		taulukko[1] = "Helsinki";
	
	for (int i = kaupungit.length-1; i == 0; i--){
		System.out.println(i+1+ ". " +kaupungit[i]);
	}
	for (int i = kaupungit.length - 1; i == 0; i-=3){
		System.out.println(i+1+ ". " +kaupungit[i]);
	}	
	Scanner syote = new Scanner(System.in);
	System.out.println("Anna etsittävä: ");
	String etsittävä = syote.nextLine();
		
		for (int i = 0; i < kaupungit.length; i++){
	
			if(kaupungit[i].equalsIgnoreCase(etsittävä))
				System.out.println(i + 1 + ". " + kaupungit[i]);
		}
	}	
}
