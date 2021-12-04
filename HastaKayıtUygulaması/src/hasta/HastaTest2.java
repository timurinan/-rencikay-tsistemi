package hasta;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class HastaTest2 {
	
	Hasta hasta;
	ArrayList<String> olmasýgerekenilaçlar=new ArrayList<>();
	@Before
	public void hastaNesnesiÜret() {
		hasta=new Hasta("Timur", "Ýnan", "Erkek", 1.72, 90);
		hasta.ilaçlar.add("Aspirin");
		hasta.ilaçlar.add("Gripin");
		
		olmasýgerekenilaçlar.add("Aspirin");
		olmasýgerekenilaçlar.add("Gripin");
	}

	@Test
	public void test() {
		assertEquals("Erkek", hasta.cinsiyet);
		System.out.println("Hasta cinsiyet kontrolü yapýldý...");
	}
	
	@Test	
	public void karþýlaþtýr() {
		
		assertArrayEquals(hasta.ilaçlar.toArray(), olmasýgerekenilaçlar.toArray());
		System.out.println("Hastanýn ilaç listesi kontrol edildi...");
	}

}
