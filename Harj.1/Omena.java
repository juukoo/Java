
public class Omena {
	
	private String väri;
	private String lajike;
	private int paino;
	
	// Antaa virheilmoituksen "The field is not visible", kun vaihtaa public --> private
	
	public Omena(){
		this.lajike = "Ei arvoa";
		this.väri = "Väritön";
		this.paino  = 0;		
	}
	
	
	public String getVäri(){
		return this.väri;
	}
	
	public String getLajike(){
		return this.lajike;
	}
	
	public int getPaino(){
		return this.paino;
	}
	
	public void setVäri(String uusiVäri){
		this.väri = uusiVäri;
	}
	
	public void setLajike(String uusiLajike){
		this.lajike = uusiLajike;
	}
	
	public void setPaino(int paino){
		this.paino = paino;
	}
	
	public String toString(){
		String tuloste = "Lajike: " + this.getLajike() + ", väri: " + this.getVäri() + ", Paino: " + this.getPaino() + ".";
		return tuloste;
	}
	
	public void haukkaa(){
		System.out.println("Rouskis!");
		this.paino-=10;
	}
	
}

