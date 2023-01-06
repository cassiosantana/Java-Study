import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(3.0));
		myCircles.add(new Circle(4.0));
		
		System.out.println("Total area: " + totalArea(myShapes));
		System.out.println("Total area: " + totalArea(myCircles));
	}

	private static double totalArea(List<? extends Shape> list) {
		/*
		 * It is not possible to add items to a wildcard-delimited list 
		 * passed as a method parameter because the compiler does not 
		 * know if the item and the list are compatible, but its items 
		 * can still be accessed.	
		 */
		list.add(new Circle(10.0)); // Unresolved compilation problem:
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}