package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        System.out.print("Enter the path of the file to be read: ");
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                Double salary = Double.parseDouble(fields[2]);
                employeeList.add(new Employee(name, email, salary));
                line = br.readLine();
            }

            System.out.print("Enter the salary limit: ");
            double criteria = sc.nextDouble();
            List<String> employeesWithSalariesAboveTheCriteria = employeeList.stream()
                    .filter(employee -> employee.getSalary() > criteria)
                    .map(Employee::getEmail).sorted(String::compareToIgnoreCase).toList();
            employeesWithSalariesAboveTheCriteria.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
