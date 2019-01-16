
public class TestaaKalat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mustekala matti = new Mustekala();
		matti.setPaino(3.2);
		System.out.println(matti);
		
		Keuhkokala keke = new Keuhkokala();
		keke.setPaino(4.62);
		System.out.println(keke);
		
		matti.vapautaMustetta();
		keke.hengittele();
		
		matti.setLonkeroita(5);
		keke.setVarsievia(6);
		
		System.out.println(matti);
		System.out.println(keke);
		
	}

}
