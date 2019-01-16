
public class Omenakone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Omena olioita
		Omena ekaOmena = new Omena();
		ekaOmena.väri = "kellanvihreä";
		ekaOmena.lajike = "Antonovka";
		ekaOmena.paino = 60;
		
		Omena tokaOmena = new Omena();
		tokaOmena.väri = "karmiini";
		tokaOmena.lajike = "Aelita";
		tokaOmena.paino = 45;
		
		Omena kolmasOmena = new Omena();
		kolmasOmena.väri = "Punainen";
		kolmasOmena.lajike = "Arx";
		kolmasOmena.paino = 150;
		
		//Tulostus
		
		System.out.println("Omenakone v. 1.0");
		System.out.println("Luodaan 3 omenaa.\n");
		System.out.println("Omena 1. Lajike: " +ekaOmena.lajike+", "+"väri: "+ekaOmena.väri+". "+ekaOmena.paino+"g");
		System.out.println("Omana 2. Lajike: " +tokaOmena.lajike+", "+"väri: "+tokaOmena.väri+". "+tokaOmena.paino+"g");
		System.out.println("Omena 3. Lajike: " +kolmasOmena.lajike+", "+"väri: "+kolmasOmena.väri+". "+kolmasOmena.paino+"g");
	}
	

}
