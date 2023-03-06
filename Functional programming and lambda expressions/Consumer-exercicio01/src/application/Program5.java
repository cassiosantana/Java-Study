package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program5 {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double fatorDeAumento = 1.1;
        list.forEach(product -> product.setPrice(product.getPrice() * 2));
        list.forEach(System.out::println);
    }
}
