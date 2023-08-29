package com.visional24.ecsite.model.entity;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;
    private String description;
    private String imagePath;


    public Product() {}

    public Product(long id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name;}

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public String getDescription(){ return description; }

    public void setDescription(String description) { this.description = description;}

    public String getImagePath() { return imagePath; }

    public void setImagePath() { this.imagePath = imagePath; }

}
