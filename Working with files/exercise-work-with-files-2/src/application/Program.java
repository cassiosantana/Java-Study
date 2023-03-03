package application;

import application.entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String path = "products.txt";
        Set<Employee> employees = new TreeSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                LocalDate birthdate = LocalDate.parse(fields[2], formatter);
                Double baseSalary = Double.parseDouble(fields[3]);
                employees.add(new Employee(name, email, birthdate, baseSalary));

                line = br.readLine();
            }
            System.out.println("#### Employees sorted by Salary ####");
            employees.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unexpected error");
        }
    }
}
