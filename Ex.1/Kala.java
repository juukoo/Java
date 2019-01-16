
public class Kala {
	
	static int parvenKoko;
	private String laji;
	private double paino;
	
	
	public Kala(){
	laji = "Ei lajia";
	paino = 0;
	parvenKoko++;
	}
	

	
	@Override
	public String toString() {
		return "Kala [laji=" + laji + ", paino=" + paino + "]";
	}



	public static int getParvenKoko() {
		return parvenKoko;
	}



	public static void setParvenKoko(int parvenKoko) {
		Kala.parvenKoko = parvenKoko;
	}



	public void setLaji(String laji){
		this.laji = laji;
	}
	
	public String getLaji(){
		return laji;
	}
	
	public void setPaino(double paino){
		this.paino = paino;
	}
	
	public double getPaino(){
		return paino;
	}
	
	
	
}
