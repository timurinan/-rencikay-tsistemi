package asalsayıuygulaması;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class AsalSayıTest {
	
	AsalSayıHesaplayıcı ash;
	
	int sayı;
	boolean sonuç;	
	
	public AsalSayıTest(int sayı, boolean sonuç) {
		super();
		this.sayı = sayı;
		this.sonuç = sonuç;
	}

	@Before
	public void init() {
		ash=new AsalSayıHesaplayıcı();
	}
	
	@Parameters
	public static Collection asalsayılar() {
		
		  return Arrays.asList(new Object[][] { {2,true},{4,false},{9,false},{20,false},{13,true}});
	}

	@Test
	public void test() {
		System.out.println("Test edilen sayı:"+sayı);
		assertEquals(sonuç,ash.asalMı(sayı));
	}

}
