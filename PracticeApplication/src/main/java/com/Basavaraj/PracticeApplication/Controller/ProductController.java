package com.Basavaraj.PracticeApplication.Controller;

import com.Basavaraj.PracticeApplication.Model.Product;
import com.Basavaraj.PracticeApplication.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProduct(){
        return service.getProducts();
    }

    @PostMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @PostMapping("/products/add")
    public void addProduct(@RequestBody Product p){
        service.addProduct(p);
    }
    @PutMapping("/products")
    public void  updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }
    @DeleteMapping("/products/{p_id}")
    public void deleteProduct(@PathVariable int p_id){
        service.deleteProduct(p_id);
    }
}
