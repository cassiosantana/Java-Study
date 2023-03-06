package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Program5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 2500.0));
        list.add(new Product("Laptop", 5000.0));
        list.add(new Product("Keyboard", 350.0));

        list.sort((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
        list.forEach(System.out::println);
    }
}
