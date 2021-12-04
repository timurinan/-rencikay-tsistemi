package hasta;

import java.util.ArrayList;

public class Hasta {
	
	
	String ad,soyad,cinsiyet;
	double boy,kilo;
	ArrayList<String> ila�lar=new ArrayList<String>();
	
	public Hasta(String ad, String soyad, String cinsiyet, double boy, double kilo) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.cinsiyet = cinsiyet;
		this.boy = boy;
		this.kilo = kilo;
	}
	
	public int yeni�la�Tan�mla(String ila�ismi,int mg,int doz) {
		//200mg den fazla 1 g�nde verilemez.
		if (mg*doz<=200&&mg*doz>=0) {
			ila�lar.add(ila�ismi);
			System.out.println("Hastaya "+ila�ismi+ " isimli ila� g�nde "+doz+" doz ve "+mg+" mg �eklinde tan�mlanm��t�r.");
			return mg*doz;
		}
		System.out.println("Belirtilen ila� g�nl�k dozaj� a�t���ndan hastaya tan�mlanmam��t�r.");
		return 0;
	}

}
