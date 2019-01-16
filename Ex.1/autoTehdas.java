
public class autoTehdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto Mazda = new Auto();
		Auto Toyota = new Auto();
		
		// Tietojen muuttaminen
		
		Mazda.väri = "Punainen";
		Mazda.nopeus = 140;
		Mazda.tankinTilavuus = 80;
		
		Toyota.väri = "Sininen";
		Toyota.nopeus = 120;
		Toyota.tankinTilavuus = 90;
		
		// Tulostus
		
		System.out.println("Mazdan tiedot: "+Mazda.väri+ " "+Mazda.nopeus +" "+ Mazda.tankinTilavuus);
	}
}