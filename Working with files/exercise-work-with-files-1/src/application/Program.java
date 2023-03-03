package application;

import application.entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        String path = "products.txt";
        Set<Product> products = new TreeSet<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String manufacturer = fields[1];
                double price = Double.parseDouble(fields[2]);
                products.add(new Product(name, manufacturer, price));
                line = br.readLine();
            }

            System.out.println("########## Non-repeating products ##########");
            products.forEach(System.out::println);

            double sum = 0.0;
            for(Product p : products) {
                sum += p.getPrice();
            }
            System.out.println("\nTotal price of non-repeating products:" + String.format("%.2f", sum));

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unexpected error");
        }
    }
}
