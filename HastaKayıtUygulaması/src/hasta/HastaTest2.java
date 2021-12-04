package hasta;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class HastaTest2 {
	//Hasta test2 sınıfı
	Hasta hasta;
	ArrayList<String> olmasıgerekenilaçlar=new ArrayList<>();
	@Before
	public void hastaNesnesiÜret() {
		hasta=new Hasta("Timur", "İnan", "Erkek", 1.72, 90);
		hasta.ilaçlar.add("Aspirin");
		hasta.ilaçlar.add("Gripin");
		
		olmasıgerekenilaçlar.add("Aspirin");
		olmasıgerekenilaçlar.add("Gripin");
	}

	@Test
	public void test() {
		assertEquals("Erkek", hasta.cinsiyet);
		System.out.println("Hasta cinsiyet kontrolü yapıldı...");
	}
	
	@Test	
	public void karşılaştır() {
		
		assertArrayEquals(hasta.ilaçlar.toArray(), olmasıgerekenilaçlar.toArray());
		System.out.println("Hastanın ilaç listesi kontrol edildi...");
	}

}
