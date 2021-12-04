package asalsayýuygulamasý;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestYürütücü {
	
	public static void main(String[] args) {
		Result testsonuçlarý=JUnitCore.runClasses(AsalSayýHesaplayýcý.class);
		
		for (Failure failure : testsonuçlarý.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(testsonuçlarý.wasSuccessful());
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
