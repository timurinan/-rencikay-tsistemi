package testpaketi;

import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		
		Scanner inputreader = new Scanner(System.in);
		
		System.out.println("1.E�yay� giriniz:");
		
		String e�ya1=inputreader.next();
		
		System.out.println("2.E�yay� giriniz:");
		
		String e�ya2=inputreader.next();
		
		System.out.println("3.E�yay� giriniz:");
		
		String e�ya3=inputreader.next();
		
		�anta �anta=new �anta();
		
		�anta.malzemeleriHaz�rla(e�ya1, e�ya2, e�ya3);

	}

}
