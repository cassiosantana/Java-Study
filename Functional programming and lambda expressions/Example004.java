import java.util.ArrayList;
import java.util.List;

class Product {
	String name;
	Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}

public class Example004 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Laptop", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
//		Dynamic typing / type inference
		list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
		list.forEach(System.out::println);

	}
}