
public class Omenakone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Omena olioita
		Omena ekaOmena = new Omena();
		ekaOmena.v�ri = "kellanvihre�";
		ekaOmena.lajike = "Antonovka";
		ekaOmena.paino = 60;
		
		Omena tokaOmena = new Omena();
		tokaOmena.v�ri = "karmiini";
		tokaOmena.lajike = "Aelita";
		tokaOmena.paino = 45;
		
		Omena kolmasOmena = new Omena();
		kolmasOmena.v�ri = "Punainen";
		kolmasOmena.lajike = "Arx";
		kolmasOmena.paino = 150;
		
		//Tulostus
		
		System.out.println("Omenakone v. 1.0");
		System.out.println("Luodaan 3 omenaa.\n");
		System.out.println("Omena 1. Lajike: " +ekaOmena.lajike+", "+"v�ri: "+ekaOmena.v�ri+". "+ekaOmena.paino+"g");
		System.out.println("Omana 2. Lajike: " +tokaOmena.lajike+", "+"v�ri: "+tokaOmena.v�ri+". "+tokaOmena.paino+"g");
		System.out.println("Omena 3. Lajike: " +kolmasOmena.lajike+", "+"v�ri: "+kolmasOmena.v�ri+". "+kolmasOmena.paino+"g");
	}
	

}
