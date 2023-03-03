package application.entities;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private String manufacturer;
    private Double price;

    public Product() {
        super();
    }

    public Product(String name, String manufacturer, Double price) {
        super();
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(manufacturer, product.manufacturer) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer, price);
    }

    @Override
    public String toString() {
        return "Name: "
                + name
                + ", Manufacturer: "
                + manufacturer
                + ", Price: "
                + String.format("%.2f", price);
    }

    @Override
    public int compareTo(Product o) {
        return this.name.toLowerCase().compareTo(o.getName().toLowerCase());
    }
}
