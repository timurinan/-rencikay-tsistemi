package testpaketi;

import java.util.Arrays;

public class �anta {
	
	//Bu bir denemedir
	
	public void malzemeleriHaz�rla(String e�ya1, String e�ya2,String e�ya3) {
		String[] malzemeler= {e�ya1,e�ya2,e�ya3};
		String[] zorunlumalzemeler= {"Kitap","Defter","Kalem"};
		if (Arrays.equals(malzemeler,zorunlumalzemeler)) {
			System.out.println("�anta ba�ar�l� �ekilde haz�rland�...");
		}
		else {
			System.err.println("�anta haz�rlan�rken bir sorun olu�tu...");
		}
	}
	
	

}
