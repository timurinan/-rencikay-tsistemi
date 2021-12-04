package hasta;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class HastaTest {
	
	Hasta hasta;

	@Before
	public void nesne�ret() {
		hasta=new Hasta("Timur", "�nan", "Erkek", 1.72, 90);
		System.out.println("Hasta nesnesi olu�turuldu...");
	}
	
	
	@Test
	public void test() {
		int toplamdozaj=hasta.yeni�la�Tan�mla("Euthrynox", 20, 2);
		Assert.assertTrue(200>=toplamdozaj&&toplamdozaj>=0);
	}
	
	@After
	public void testSonland�r() {
		System.out.println("T�m testler ba�ar�yla ger�ekle�mi�tir...");
	}
	
	
	

}
