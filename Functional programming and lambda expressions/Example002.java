import java.util.Arrays;

public class Example002 {
	/*
	 * This program is a wrong example of referential transparency. 
	 * When a function depends exclusively on input values there is referential transparency. 
	 * This makes the function easier to understand.
	 */
	
	public static int globalValue = 3;

	public static void main(String[] args) {
		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
	}

//	Depends on values that are not its input parameters
	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
}