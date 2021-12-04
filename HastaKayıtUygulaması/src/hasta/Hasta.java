package hasta;

import java.util.ArrayList;

public class Hasta {
	
	//Deðiþiklik yaptým... Yine Deðiþiklik
	String ad,soyad,cinsiyet;
	double boy,kilo;
	ArrayList<String> ilaçlar=new ArrayList<String>();
	
	public Hasta(String ad, String soyad, String cinsiyet, double boy, double kilo) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.cinsiyet = cinsiyet;
		this.boy = boy;
		this.kilo = kilo;
	}
	
	public int yeniÝlaçTanýmla(String ilaçismi,int mg,int doz) {
		//200mg den fazla 1 günde verilemez.
		if (mg*doz<=200&&mg*doz>=0) {
			ilaçlar.add(ilaçismi);
			System.out.println("Hastaya "+ilaçismi+ " isimli ilaç günde "+doz+" doz ve "+mg+" mg þeklinde tanýmlanmýþtýr.");
			return mg*doz;
		}
		System.out.println("Belirtilen ilaç günlük dozajý aþtýðýndan hastaya tanýmlanmamýþtýr.");
		return 0;
	}

}
