package com.data.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.Entity.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer>{

}
