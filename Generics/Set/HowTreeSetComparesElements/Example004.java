import java.util.Set;
import java.util.TreeSet;

public class Example004 {

	public static void main(String[] args) {
		/*
		 * The collection instantiated as a TreeSet needs its type 
		 * to implement the Comparable<T> Interface because the TreeSet 
		 * is sorted by the compareTo() method.
		 */
		Set<Product> set = new TreeSet<>();
		set.add(new Product("Tv", 3000.0));
		set.add(new Product("TV", 4000.0));
		set.add(new Product("laptop", 2000.0));
		set.add(new Product("Tablet", 2000.0));
		System.out.println(set.size());
		
		for (Product prod : set) {
			System.out.println(prod);
		}
	}
}