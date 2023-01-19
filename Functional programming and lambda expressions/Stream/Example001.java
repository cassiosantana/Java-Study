
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example001 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		/* 
		 * https://devdocs.io/openjdk~17/java.base/java/util/stream/stream
		 * A sequence of elements supporting sequential and parallel aggregate operations
		 * Stream is a solution for processing data sequences
		 * Sequential access (no indexes)
		 * Single-use
		 */

		Stream<Integer> st1 = list.stream().map(x -> x * -1);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Cassio", "Elizama", "Karen").filter(x -> x.charAt(0) == 'K');
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + -2);
		System.out.println(Arrays.toString(st3.limit(5).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L}, 
				x -> new Long[]{x[1], x[0]+x[1]}).map(x -> x[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
	}
}
