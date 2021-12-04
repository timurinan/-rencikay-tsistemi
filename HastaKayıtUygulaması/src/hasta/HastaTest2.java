package hasta;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class HastaTest2 {
	//Hasta test2 s�n�f�
	Hasta hasta;
	ArrayList<String> olmas�gerekenila�lar=new ArrayList<>();
	@Before
	public void hastaNesnesi�ret() {
		hasta=new Hasta("Timur", "�nan", "Erkek", 1.72, 90);
		hasta.ila�lar.add("Aspirin");
		hasta.ila�lar.add("Gripin");
		
		olmas�gerekenila�lar.add("Aspirin");
		olmas�gerekenila�lar.add("Gripin");
	}

	@Test
	public void test() {
		assertEquals("Erkek", hasta.cinsiyet);
		System.out.println("Hasta cinsiyet kontrol� yap�ld�...");
	}
	
	@Test	
	public void kar��la�t�r() {
		
		assertArrayEquals(hasta.ila�lar.toArray(), olmas�gerekenila�lar.toArray());
		System.out.println("Hastan�n ila� listesi kontrol edildi...");
	}

}
