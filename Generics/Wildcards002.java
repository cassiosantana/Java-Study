import java.util.Arrays;
import java.util.List;

public class Wildcards002 {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 20, 30);
		printList(myList);
		
	}

	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
