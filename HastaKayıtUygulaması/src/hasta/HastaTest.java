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
	public void nesneÜret() {
		hasta=new Hasta("Timur", "Ýnan", "Erkek", 1.72, 90);
		System.out.println("Hasta nesnesi oluþturuldu...");
	}
	
	
	@Test
	public void test() {
		int toplamdozaj=hasta.yeniÝlaçTanýmla("Euthrynox", 20, 2);
		Assert.assertTrue(200>=toplamdozaj&&toplamdozaj>=0);
	}
	
	@After
	public void testSonlandýr() {
		System.out.println("Tüm testler baþarýyla gerçekleþmiþtir...");
	}
	
	
	

}
