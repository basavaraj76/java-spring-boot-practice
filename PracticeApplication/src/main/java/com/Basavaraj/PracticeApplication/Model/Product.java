package com.Basavaraj.PracticeApplication.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;
    private String product_name;
    private double price;
    private String description;
    private String category;
    private String brand;
    private String discount_price;
    private int stock;
    private boolean  available;
    private String image;
    private String release_date;

}
