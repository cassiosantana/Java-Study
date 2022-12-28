package application;

import devices.Printer;
import devices.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Printer p = new Printer("55444");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		System.out.println("------------------------------------");
		
		Scanner s = new Scanner("66555");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
	}
}