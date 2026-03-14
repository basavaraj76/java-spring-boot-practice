package com.Basavaraj.PracticeApplication.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private int product_id;

    @Column(name="product_name")
    private String product_name;

    private double price;

    private String description;

    private String category;

    private String brand;

    @Column(name="discount_price")
    private double discount_price;

    private int stock;

    private boolean available;

    private String image;

    @Column(name="release_date")
    private String release_date;

    public int getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public double getDiscount_price() {
        return discount_price;
    }

    public int getStock() {
        return stock;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getImage() {
        return image;
    }

    public String getRelease_date() {
        return release_date;
    }
}
