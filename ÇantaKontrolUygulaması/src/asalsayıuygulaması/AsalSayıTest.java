package asalsay�uygulamas�;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class AsalSay�Test {
	
	AsalSay�Hesaplay�c� ash;
	
	int say�;
	boolean sonu�;	
	
	public AsalSay�Test(int say�, boolean sonu�) {
		super();
		this.say� = say�;
		this.sonu� = sonu�;
	}

	@Before
	public void init() {
		ash=new AsalSay�Hesaplay�c�();
	}
	
	@Parameters
	public static Collection asalsay�lar() {
		
		  return Arrays.asList(new Object[][] { {2,true},{4,false},{9,false},{20,false},{13,true}});
	}

	@Test
	public void test() {
		System.out.println("Test edilen say�:"+say�);
		assertEquals(sonu�,ash.asalM�(say�));
	}

}
