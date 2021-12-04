package hasta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({HastaTest.class,HastaTest2.class})

public class SuiteHasta {

	@Test
	public void test() {
		//System.out.println("Her iki test birden gerçekleştirildi...");
	}

}
