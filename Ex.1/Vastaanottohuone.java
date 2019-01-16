package project_2;

public class Vastaanottohuone {

	public static void main(String[] args) {
		double huoneenKorkeus = 2.80;
		double huoneenLeveys = 4.07;
		double huoneenSyvyys = 3.21;
		double huoneenTilavuus = 0.0;
		
		huoneenTilavuus = huoneenKorkeus*huoneenLeveys*huoneenSyvyys;
		
		System.out.print(huoneenTilavuus);
	}

}
