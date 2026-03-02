package com.Basavaraj.PracticeApplication.Repository;

import com.Basavaraj.PracticeApplication.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
