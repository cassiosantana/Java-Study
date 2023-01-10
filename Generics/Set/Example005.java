import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Example005 {

	public static void main(String[] args) {
		/*
		 * A program that informs the number of students a professor has 
		 * in his three courses. The result considers that a student may 
		 * be studying in more than one course and he should not be 
		 * considered another student, that is, there should be no repetitions. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantity = 0;
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		quantity = sc.nextInt();
		for (int i = 0; i < quantity; i++) {
			courseA.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B? ");
		quantity = sc.nextInt();
		for (int i = 0; i < quantity; i++) {
			courseB.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		quantity = sc.nextInt();
		for (int i = 0; i < quantity; i++) {
			courseC.add(sc.nextInt());
		}
		
		Set<Integer> total = new HashSet<>(courseA);
		total.addAll(courseB);
		total.addAll(courseC);
		System.out.println("Total students: " + total.size());
		
		sc.close();
	}
}