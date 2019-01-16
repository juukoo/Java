package project_1;

public class luottoTili extends Pankkitili {
	
	double luottoRaja = 15000;
	double nostopalkkio = 5;
	
	public int nostaRahaa(int summa){
		return summa;
		
	}
	
	public void tallennaRahaa(int summa){
		if(getTilinSaldo() < luottoRaja){
			System.out.println("Luottoraja täynnä!");
		}else{
			luottoRaja = summa + nostopalkkio;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
