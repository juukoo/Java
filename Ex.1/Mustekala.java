
public class Mustekala extends Kala {
	
	private int lonkeroita;
	public void vapautaMustetta() {
		System.out.println("Mustetta p‰‰stetty!");
	}
	
	public Mustekala(){
		setLaji("Mustekala");
		setPaino(45);
		this.lonkeroita = 8;
	}
	
	public void setLonkeroita(int lonkeroita){
		this.lonkeroita = lonkeroita;
	}
	
	public int lonkeroita(){
		return lonkeroita;
	}
	
	
	
	@Override
	public String toString() {
		return  super.toString() + "Mustekala [lonkeroita=" + lonkeroita + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
