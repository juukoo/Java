import java.util.Scanner;

public class Juoma_automaatti {
	
	
	public int teeta;
	public int kahvia;
	public int kaakaota;
	
	public void valmistaTee(){
		if(teeta > 0){ // Jos juoman m��r� enemm�n kuin 0, juomaa valmistetaan.
			teeta -= 10; // valmistuksen j�lkeen v�hennet��n 10 yksikk��.
			System.out.println("Odota hetki, teesi valmistuu. " + "Teet� j�ljell� "+ teeta +" yksikk��.");
		}else
			System.out.println("Tee loppui, pahoittelut. " + "T�yt� s�ili� tilataksesi lis�� tai valitse toinen tuote.\n" + "--------------------------------------------------------");
	}	// Jos juoman yksikk� laskee 0, tulostetaan
	
	public void valmistaKahvi(){
		if(kahvia > 0){
			kahvia -= 10;
			System.out.println("Odota hetki, kahvisi valmistuu. " + "Kahvia j�ljell� "+ kahvia + " yksikk��.");
		}else
			System.out.println("Kahvi loppui, pahoittelut. " + "T�yt� s�ili� tilataksesi lis�� tai valitse toinen tuote.\n" + "--------------------------------------------------------");
	}
	public void valmistaKaakao(){
		if(kaakaota > 0){
			kaakaota -= 10;
			System.out.println("Odota hetki, kaakaosi valmistuu. " + "Kaakaota j�ljell� "+ kaakaota + " yksikk��.");
		}else
			System.out.println("Kaakao loppui, pahoittelut. " + "T�yt� s�ili� tilataksesi lis�� tai valitse toinen tuote.\n" + "--------------------------------------------------------");
	}
	
	public Juoma_automaatti(){ //Juoma-Automaatin konstruktori.
		teeta = 50;
		kahvia = 50;
		kaakaota = 50;
		
	}
/*
	public int getTeeta() {
		return teeta;
	}
	public void setTeeta(int teeta) {
		this.teeta = teeta;
	}
	public int getKahvia() {
		return kahvia;
	}
	public void setKahvia(int kahvia) {
		this.kahvia = kahvia;
	}
	public int getKaakota() {
		return kaakaota;
	}
	public void setKaakota(int kaakota) {
		this.kaakaota = kaakota;
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Juoma_automaatti omaKone = new Juoma_automaatti(); // Luodaan automaatista testi toiminto (Olio).
		
		/*
		omaKone.valmistaKahvi();
		omaKone.valmistaKahvi();
		
		omaKone.valmistaTee();
		omaKone.valmistaTee();
		omaKone.valmistaTee();
		omaKone.valmistaTee();
		omaKone.valmistaTee();
		omaKone.valmistaTee();
		
		omaKone.valmistaKaakao();
		omaKone.valmistaKaakao();
		omaKone.valmistaKaakao();
		*/
		// Ohjelma n�ytt�isi toimivan t�ss�.
		
		Scanner syote = new Scanner(System.in); // Alustetaan Scanner luokka.
		
		System.out.print("��������Juoma-Automaatti����������\n");
		System.out.print("\n1.Kahvi\n" + "2.Tee\n" + "3.Kaakao\n");
		System.out.print("\n---------------------------------\n"); // Graafista n�kym�� tulostuu k�ytt�j�lle.
		
		String valinta = syote.nextLine(); // Nappaa k�ytt�j�n antaman sy�tteen.
		
		
		switch(valinta){   // Switch lauseella valitaan jokin 3 juomasta.
			case "1" :
				omaKone.valmistaKahvi(); // Valmistaa kahvia, kun annetaan numero 1
				/*System.out.println("Kahvia j�ljell�: " +kahvia+ " Teet� j�ljell�: " +teeta+ " Kaakaota j�ljell�: " +kaakaota);*/
				break;
			case "2" :
				omaKone.valmistaTee(); // Valmistaa Teet�, kun annetaan numero 2
				break;
			case "3":
				omaKone.valmistaKaakao(); // Valmistaa kaakaon, kun annetaan numero 3
				break;
				default :
					System.out.println("Ei tuotetta numerolla."); // Tulostuu, jos annetaan muu kuin 1,2,3.
					
					// En keksinyt miten saisin j�ljelle j��v�n m��r�n n�kym��n esimerkin tavalla: Kahvia j�ljell�: 40 Teet� j�ljell� 50 Kaakaota j�ljell� 50
					// My�s ohjelman jatkuminen uudelleen sen ajamisen j�lkeen tuotti ongelmian niin, ett� siin� n�kyisi edellisen kerran j�lkeen j�ljelle j��neet m��r�t.
			}		
		}
		
	}


