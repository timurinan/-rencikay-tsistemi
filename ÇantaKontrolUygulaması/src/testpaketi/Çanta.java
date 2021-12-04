package testpaketi;

import java.util.Arrays;

public class Çanta {
	
	
	
	public void malzemeleriHazýrla(String eþya1, String eþya2,String eþya3) {
		String[] malzemeler= {eþya1,eþya2,eþya3};
		String[] zorunlumalzemeler= {"Kitap","Defter","Kalem"};
		if (Arrays.equals(malzemeler,zorunlumalzemeler)) {
			System.out.println("Çanta baþarýlý þekilde hazýrlandý...");
		}
		else {
			System.err.println("Çanta hazýrlanýrken bir sorun oluþtu...");
		}
	}
	
	

}
