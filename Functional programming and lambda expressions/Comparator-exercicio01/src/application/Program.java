package application;

import entities.Product;
import util.MyComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 2500.0));
        list.add(new Product("Laptop", 5000.0));
        list.add(new Product("Keyboard", 350.0));

        list.sort(new MyComparator());

        list.forEach(System.out::println);
    }
}
