import java.util.Map;
import java.util.TreeMap;

public class Example001 {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();
		cookies.put("userName", "Cassio");
		cookies.put("phoneNumber", "99999-9991");
		cookies.put("email", "cassio@gmail.com");
		cookies.remove("phoneNumber");
		cookies.put("userName", "Karen");

		System.out.println("Contains 'cassio@gmail.com' value: " + cookies.containsValue("cassio@gmail.com"));
		System.out.println("Contains 'userName' key: " + cookies.containsKey("userName"));
		System.out.println("User name: " + cookies.get("userName"));
		System.out.println("Size: " + cookies.size());

		System.out.println("-------------------------------");

		for (String key : cookies.keySet()) {
			System.out.println(key + ", " + cookies.get(key));
		}
	}

}
