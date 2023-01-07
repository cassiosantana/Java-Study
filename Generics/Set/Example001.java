
import java.util.LinkedHashSet;
import java.util.Set;

public class Example001 {

	public static void main(String[] args) {
		/*
		 * Set is a generic type data structure that represents a 
		 * set of non-repeating elements that have no positions.
		 * 
		 * HashSet - Faster but not ordered
		 * TreeSet - Slow but sorted by compareTo
		 * LinkedHashSet - Intermediate speed and elements will be 
		 * stored in the order they are added
		 */
		
		
		Set<String> set = new LinkedHashSet<>();
		set.add("Karen");
		set.add("Cassio");
		set.add("Elizama");
		set.add("Cassio"); // Duplicate items are not added
		System.out.println(set.size());
		
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("---------------------");
		
		set.removeIf(x -> x.charAt(0) == 'C');
		set.remove("Elizama");
		System.out.println(set.contains("Karen"));

		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("---------------------");
		
		set.clear();
		for (String s : set) {
			System.out.println(s);
		}
		
	}
}