import java.util.ArrayList;
import java.util.List;

public class Wildcards003 {

	public static void main(String[] args) {
		List<?> list = new ArrayList<>();
		
//		The compiler does not know what type the list was instantiated with
		list.add(3);
		list.add("Name");
		list.add(new Object());
	}
}