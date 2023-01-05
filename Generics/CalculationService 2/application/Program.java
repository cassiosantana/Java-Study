package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Laptop;
import entities.Product;
import entities.Tv;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> productlist = new ArrayList<>();
		productlist.add(new Product ("Mouse", 100.0));
		productlist.add(new Product ("Keyboard", 150.0));
		Product product1 = CalculationService.max(productlist);
		System.out.println(product1);
		
		System.out.println("---------------------------------");
		
		List<Laptop> laptopList = new ArrayList<>();
		laptopList.add(new Laptop("Dell", 4000.00));
		laptopList.add(new Laptop("Samsung", 3000.00));
		Laptop product2 = CalculationService.max(laptopList);
		System.out.println(product2);
		
		System.out.println("---------------------------------");
		
		List<Tv> tvList = new ArrayList<>();
		tvList.add(new Tv("LG", 2050.00));
		tvList.add(new Tv("Samsung", 3000.00));
		/*
		 * The max() method does not accept a subclass as a parameter. 
		 * Just a generic class. The 'T' in List<T> defines this.
		 */
		Tv product3 = CalculationService.max(tvList); // Unresolved compilation problem
		System.out.println(product3);
	}
}