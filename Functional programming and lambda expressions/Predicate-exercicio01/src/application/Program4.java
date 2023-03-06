package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program4 {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double precoMaximo = 100.0;
        Predicate<Product> predicate = product -> product.getPrice() > precoMaximo;

        list.removeIf(predicate);
        list.forEach(System.out::println);
    }

}
