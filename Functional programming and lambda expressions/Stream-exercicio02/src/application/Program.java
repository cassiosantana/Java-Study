package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> products = new ArrayList<>();
        String path = "in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                products.add(new Product(name, price));
                line = br.readLine();
            }

            double avg = products.stream().map(Product::getPrice).reduce(0.0, Double::sum) / products.size();
            System.out.printf("AVG: %.2f\n", avg);

            Comparator<String> comparator = String::compareToIgnoreCase;
            List<String> names = products.stream().map(Product::getName).sorted(comparator.reversed()).toList();
            names.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
