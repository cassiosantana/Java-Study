import java.util.ArrayList;
import java.util.List;

public class Contravariance {

	public static void main(String[] args) {
		
		List<Object> myObjects = new ArrayList<>();
		myObjects.add("Cassio");
		myObjects.add("Karen");
		
		List<? super Number> myList = myObjects;
		myList.add(10);
		myList.add(15.3);
		
		/* 
		 * If the compiler allowed us to write this line below, 
		 * we would have a runtime error.
		 */
		Number x = myList.get(0); // Unresolved compilation problem

		/*
		 * Contravariance is the inverse of Covariance and can add items. 
		 * We cannot safely read any of this contravariant structure. 
		 * The compiler does not take the risk of allowing this unsafe 
		 * operation and immediately rejects it.
		 */
	}
}