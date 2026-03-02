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
        for(Product p : products){
            if(id == p.getProduct_id()){
                return p;
            }
        }
        return null;
    }

    public void addProduct(Product p) {
        products.add(p);
    }
    public void updateProduct(Product prod){
        int index = 0;
        for (int i=0; i<products.size(); i++)
            if(products.get(i).getProduct_id() == prod.getProduct_id())
                index = i;
        products.set(index,prod);

    }

    public void deleteProduct(int p_id) {

        int index = 0;
        for (int i=0; i<products.size(); i++)
            if(products.get(i).getProduct_id() == p_id)
                index = i;
        products.remove(index);
    }
}
