package asalsay�uygulamas�;

public class AsalSay�Hesaplay�c� {
	
	public boolean asalM�(int say�) {
		
		for (int i = say�/2; i >=2 ; i--) {
			if (say�%i==0) {
				return false;
			}
		}
		return true;
	}

}
