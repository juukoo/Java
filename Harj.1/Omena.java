
public class Omena {
	
	private String v�ri;
	private String lajike;
	private int paino;
	
	// Antaa virheilmoituksen "The field is not visible", kun vaihtaa public --> private
	
	public Omena(){
		this.lajike = "Ei arvoa";
		this.v�ri = "V�rit�n";
		this.paino  = 0;		
	}
	
	
	public String getV�ri(){
		return this.v�ri;
	}
	
	public String getLajike(){
		return this.lajike;
	}
	
	public int getPaino(){
		return this.paino;
	}
	
	public void setV�ri(String uusiV�ri){
		this.v�ri = uusiV�ri;
	}
	
	public void setLajike(String uusiLajike){
		this.lajike = uusiLajike;
	}
	
	public void setPaino(int paino){
		this.paino = paino;
	}
	
	public String toString(){
		String tuloste = "Lajike: " + this.getLajike() + ", v�ri: " + this.getV�ri() + ", Paino: " + this.getPaino() + ".";
		return tuloste;
	}
	
	public void haukkaa(){
		System.out.println("Rouskis!");
		this.paino-=10;
	}
	
}

