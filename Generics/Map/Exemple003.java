package teste002;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Exemple003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votes = new HashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				String name = fields[0];
				Integer value = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, value + votesSoFar);
				} else {
					votes.put(name, value);
				}

				line = br.readLine();
			}

			for (String key : votes.keySet()) {
				System.out.println(key + ", " + votes.get(key));
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}