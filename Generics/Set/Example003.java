import java.util.HashSet;
import java.util.Set;

class Product {
	/*
	 * Hashcode and equals were not implemented.
	 */
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
}

public class Example003 {

	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		set.add(new Product("Tv", 3000.0));
		set.add(new Product("Mouse", 100.0));
		set.add(new Product("Laptop", 2000.0));
		
		Product product = new Product("Laptop", 2000.0);
		System.out.println(set.contains(product));
		
		/*
		 * Hash collections test equality in two ways:
		 * 
		 * 	1 - If hashCode and equals are implemented,
		 * 		First hasCode. If the result is equal, use 
		 * 		equals to confirm.
		 * 		Remembering that String, Integer, Double, etc... already 
		 * 		have equals and hashCode implemented.
		 * 	2 - If hashCode and equals are not implemented:
		 * 		Object references will be compared.
		 */
	}
}