package application.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String name;
    private String email;
    private LocalDate birthdate;
    private Double baseSalary;

    public Employee(String name, String email, LocalDate birthdate, Double baseSalary) {
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(email, employee.email) && Objects.equals(birthdate, employee.birthdate) && Objects.equals(baseSalary, employee.baseSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, birthdate, baseSalary);
    }

    @Override
    public String toString() {
        return name
                + ", "
                + email
                + ", "
                + formatter.format(birthdate)
                + ", US$ "
                + String.format("%.2f", baseSalary);
    }

    @Override
    public int compareTo(Employee o) {
        return -this.getBaseSalary().compareTo(o.getBaseSalary());
    }
}
