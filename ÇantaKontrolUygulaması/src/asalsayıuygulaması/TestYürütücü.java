package asalsay�uygulamas�;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestY�r�t�c� {
	
	public static void main(String[] args) {
		Result testsonu�lar�=JUnitCore.runClasses(AsalSay�Hesaplay�c�.class);
		
		for (Failure failure : testsonu�lar�.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(testsonu�lar�.wasSuccessful());
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
