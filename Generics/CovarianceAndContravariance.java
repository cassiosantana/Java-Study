import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CovarianceAndContravariance {

	public static void main(String[] args) {
		
		List<Integer> myIntegers = Arrays.asList(10, 20, 30);
		List<Double> myDoubles = Arrays.asList(40.4, 50.5, 60.6);
		List<Object> myObjects = new ArrayList<>();
		
		copy(myIntegers, myObjects);
		copy(myDoubles, myObjects);
		printList(myObjects);

	}
	
	/*
	 * The 'source' list is a case of covariance which read operations are allowed. 
	 * The 'destiny' list is a contravariance case that allows additions.
	 */
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}
}