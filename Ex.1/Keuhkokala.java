
public class Keuhkokala extends Kala {
	
	private int varsievia;
	public void hengittele() {
		System.out.println("Huoh -- Hengittelen ilmaa.");
	}
	
	@Override
	public String toString() { 
		return super.toString()  + "Keuhkokala [varsievia=" + varsievia + "]";
	}

	public Keuhkokala(){
		setLaji("Keuhkokala");
		setPaino(15);
		this.varsievia = 4;
	}
	
	public void setVarsievia(int varsievia){
		this.varsievia = varsievia;
	}
	
	public int varsievia(){
		return varsievia;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
