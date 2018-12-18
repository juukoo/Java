package project_1;

public class Pankkitili {
	
	private String tilinumero;
	private double tilinSaldo;
	
	
	public Pankkitili(){
		tilinumero = "Ei numeroa";
		tilinSaldo = 0;
	}

	public static void main(String[] args) {
	

	}

	public String getTilinumero() {
		return tilinumero;
	}

	public void setTilinumero(String tilinumero) {
		this.tilinumero = tilinumero;
	}


	public double getTilinSaldo() {
		return tilinSaldo;
	}

	
	public void setTilinSaldo(double tilinSaldo) {
		this.tilinSaldo = tilinSaldo;
	}

}


	




