package com.Basavaraj.PracticeApplication.Service;

import com.Basavaraj.PracticeApplication.Model.Product;
import com.Basavaraj.PracticeApplication.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }
    public Product getProductById(int id){
        return repo.findById(id).orElse(new Product());
    }

    public void addProduct(Product p) {
        repo.save(p);
    }
    public void updateProduct(Product prod){
        repo.save(prod);

    }

    public void deleteProduct(int p_id) {
        repo.deleteById(p_id);
    }
}
