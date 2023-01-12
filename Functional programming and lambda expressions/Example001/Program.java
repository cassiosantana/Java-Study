import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Laptop", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		/*
		 * The sort method takes a Comparator as a parameter. 
		 * Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		 * list.sort(comp);
		 * Passing this lambda expression as a parameter the code is very simplified and not verbose
		 */
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}
	}
}