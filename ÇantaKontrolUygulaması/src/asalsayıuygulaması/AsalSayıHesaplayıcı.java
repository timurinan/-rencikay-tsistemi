package asalsayıuygulaması;

public class AsalSayıHesaplayıcı {
	
	public boolean asalMı(int sayı) {
		
		for (int i = sayı/2; i >=2 ; i--) {
			if (sayı%i==0) {
				return false;
			}
		}
		return true;
	}

}
