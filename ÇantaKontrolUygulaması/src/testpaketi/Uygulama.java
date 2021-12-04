package testpaketi;

import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		
		Scanner inputreader = new Scanner(System.in);
		
		System.out.println("1.Eþyayý giriniz:");
		
		String eþya1=inputreader.next();
		
		System.out.println("2.Eþyayý giriniz:");
		
		String eþya2=inputreader.next();
		
		System.out.println("3.Eþyayý giriniz:");
		
		String eþya3=inputreader.next();
		
		Çanta çanta=new Çanta();
		
		çanta.malzemeleriHazýrla(eþya1, eþya2, eþya3);

	}

}
