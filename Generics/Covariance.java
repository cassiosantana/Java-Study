import java.util.ArrayList;
import java.util.List;

public class Covariance {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		
		List<? extends Number> list = intList;
		Number x = list.get(0);
		list.add(30); // Unresolved compilation problem
		
		/*
		 * Covariance
		 * It is possible to read items from a structure but it is not 
		 * possible to write anything to it.
		 * The compiler does not know if there is type compatibility.
		 */
		

	}

}
