import java.util.Arrays;
import java.util.List;

public class Example005 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		
		Integer sum = 0;
		for (Integer x : list) {
		sum += x;
		}
		System.out.println(sum);
		
		System.out.println("-----------------------------------");
		
//		Expressiveness / concise code
		int sum2 = list.stream().reduce(0, Integer::sum);
		System.out.println(sum2);
	}
}