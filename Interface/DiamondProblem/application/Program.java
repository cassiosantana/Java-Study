package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("55444");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		System.out.println("------------------------------------");
		
		ConcreteScanner s = new ConcreteScanner("66555");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println("------------------------------------");
		
		ComboDevice c = new ComboDevice("77666");
		c.processDoc("My document");
		c.print("My document");
		System.out.println("Combo Device result: " + c.scan());
	}
}