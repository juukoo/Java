
public class Omenakone_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Omenakone v. 1.1");
		System.out.println("Luodaan 3 omenaa.\n");
		
		//Omena olioita
		Omena_ ekaOmena = new Omena_();
		ekaOmena.setV‰ri("Punainen");
		//System.out.println(ekaOmena.getV‰ri());
		ekaOmena.setLajike("Arx");
		//System.out.println(ekaOmena.getLajike());
		ekaOmena.setPaino(150);
		//System.out.println(ekaOmena.getPaino()+" grammaa");
		
		System.out.println(ekaOmena);
		
		Omena_ tokaOmena = new Omena_();
		tokaOmena.setV‰ri("Vihre‰");
		//System.out.println(tokaOmena.getV‰ri());
		tokaOmena.setLajike("Beforest");
		//System.out.println(tokaOmena.getLajike());
		tokaOmena.setPaino(120);
		//System.out.println(tokaOmena.getPaino()+" grammaa");
		
		System.out.println(tokaOmena);
		
		Omena_ kolmasOmena = new Omena_();
		kolmasOmena.setV‰ri("Karmiini");
		//System.out.println(kolmasOmena.getV‰ri());
		kolmasOmena.setLajike("Aelita");
		//System.out.println(kolmasOmena.getLajike());
		kolmasOmena.setPaino(45);
		//System.out.println(kolmasOmena.getPaino()+" grammaa");
		
		System.out.println(kolmasOmena);
		
		Omena_ nelj‰sOmena = new Omena_();
		
		System.out.println(nelj‰sOmena+"\n");
		
		//Muiden metodien lis‰‰mist‰ 
		
		ekaOmena.haukkaa();
		System.out.println(ekaOmena);
		ekaOmena.haukkaa();
		System.out.println(ekaOmena);
		
		//Tulostus 1.0
		
		//System.out.println("Omenakone v. 1.0");
		//System.out.println("Luodaan 3 omenaa.\n");
		//System.out.println("Omena 1. Lajike: " +ekaOmena.lajike+", "+"v‰ri: "+ekaOmena.v‰ri+". "+ekaOmena.paino+"g");
		//System.out.println("Omana 2. Lajike: " +tokaOmena.lajike+", "+"v‰ri: "+tokaOmena.v‰ri+". "+tokaOmena.paino+"g");
		//System.out.println("Omena 3. Lajike: " +kolmasOmena.lajike+", "+"v‰ri: "+kolmasOmena.v‰ri+". "+kolmasOmena.paino+"g");
	}
	

}
