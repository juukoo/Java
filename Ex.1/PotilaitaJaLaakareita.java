package project_2;

public class PotilaitaJaLaakareita {

	public static void main(String[] args) {
		int potilaidenLkm = 21;
		int laakareidenLkm = 5;
		double laakareitaPotilastaKohti = 0;
		int lomakkeita = 18;
		
		System.out.println("Henkilöitä sairaalassa: " +(potilaidenLkm + laakareidenLkm));
		
		potilaidenLkm++;
		System.out.println("Potilaita: " +potilaidenLkm);
		laakareidenLkm-=3;
		System.out.println("Lääkäreitä: " +laakareidenLkm);
		
		laakareitaPotilastaKohti = potilaidenLkm / laakareidenLkm;
		System.out.println("Potilaita yhdellä lääkärillä: " + laakareitaPotilastaKohti);
		
		System.out.println("Potilaita voidaan ottaa vastaan: " +(lomakkeita / 3));
		
		System.out.println("Lomakkeita jäi käyttämättä: " + (lomakkeita % 3));
		
		double luku = 4.7654;
		
		System.out.println((int) luku);
		
		System.out.println("IDE: \"Eclipse\"");
		System.out.println("Workspace: \"H:\\eclipse_workspace\"");
	}

}
