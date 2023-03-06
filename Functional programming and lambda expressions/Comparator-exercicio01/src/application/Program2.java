package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Program2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 2500.0));
        list.add(new Product("Laptop", 5000.0));
        list.add(new Product("Keyboard", 350.0));

        Comparator<Product> myComparator  = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        };

        list.sort(myComparator);
        list.forEach(System.out::println);
    }
}
