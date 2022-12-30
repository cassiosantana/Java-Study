import java.util.InputMismatchException;
import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("This Position does not exist");
		} catch (InputMismatchException e2) {
			System.out.println("Input Error");
		}
		
		System.out.println("End of program");
		
		sc.close();
	}
}