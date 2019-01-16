import java.util.Scanner;

public class Juoma_automaatti {
	
	
	public int teeta;
	public int kahvia;
	public int kaakaota;
	
	public void valmistaTee(){
		if(teeta > 0){ // Jos juoman määrä enemmän kuin 0, juomaa valmistetaan.
			teeta -= 10; // valmistuksen jälkeen vähennetään 10 yksikköä.
			System.out.println("Odota hetki, teesi valmistuu. " + "Teetä jäljellä "+ teeta +" yksikköä.");
		}else
			System.out.println("Tee loppui, pahoittelut. " + "Täytä säiliö tilataksesi lisää tai valitse toinen tuote.\n" + "--------------------------------------------------------");
	}	// Jos juoman yksikkö laskee 0, tulostetaan
	
	public void valmistaKahvi(){
		if(kahvia > 0){
			kahvia -= 10;
			System.out.println("Odota hetki, kahvisi valmistuu. " + "Kahvia jäljellä "+ kahvia + " yksikköä.");
		}else
			System.out.println("Kahvi loppui, pahoittelut. " + "Täytä säiliö tilataksesi lisää tai valitse toinen tuote.\n" + "--------------------------------------------------------");
	}
	public void valmistaKaakao(){
		if(kaakaota > 0){
			kaakaota -= 10;
			System.out.println("Odota hetki, kaakaosi valmistuu. " + "Kaakaota jäljellä "+ kaakaota + " yksikköä.");
		}else
			System.out.println("Kaakao loppui, pahoittelut. " + "Täytä säiliö tilataksesi lisää tai valitse toinen tuote.\n" + "--------------------------------------------------------");
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
		// Ohjelma näyttäisi toimivan tässä.
		
		Scanner syote = new Scanner(System.in); // Alustetaan Scanner luokka.
		
		System.out.print("¨¨¨¨¨¨¨¨Juoma-Automaatti¨¨¨¨¨¨¨¨¨¨\n");
		System.out.print("\n1.Kahvi\n" + "2.Tee\n" + "3.Kaakao\n");
		System.out.print("\n---------------------------------\n"); // Graafista näkymää tulostuu käyttäjälle.
		
		String valinta = syote.nextLine(); // Nappaa käyttäjän antaman syötteen.
		
		
		switch(valinta){   // Switch lauseella valitaan jokin 3 juomasta.
			case "1" :
				omaKone.valmistaKahvi(); // Valmistaa kahvia, kun annetaan numero 1
				/*System.out.println("Kahvia jäljellä: " +kahvia+ " Teetä jäljellä: " +teeta+ " Kaakaota jäljellä: " +kaakaota);*/
				break;
			case "2" :
				omaKone.valmistaTee(); // Valmistaa Teetä, kun annetaan numero 2
				break;
			case "3":
				omaKone.valmistaKaakao(); // Valmistaa kaakaon, kun annetaan numero 3
				break;
				default :
					System.out.println("Ei tuotetta numerolla."); // Tulostuu, jos annetaan muu kuin 1,2,3.
					
					// En keksinyt miten saisin jäljelle jäävän määrän näkymään esimerkin tavalla: Kahvia jäljellä: 40 Teetä jäljellä 50 Kaakaota jäljellä 50
					// Myös ohjelman jatkuminen uudelleen sen ajamisen jälkeen tuotti ongelmian niin, että siinä näkyisi edellisen kerran jälkeen jäljelle jääneet määrät.
			}		
		}
		
	}


