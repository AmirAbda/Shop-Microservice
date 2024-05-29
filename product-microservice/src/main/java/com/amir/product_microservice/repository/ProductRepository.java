package com.amir.product_microservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amir.product_microservice.model.Product;

public interface  ProductRepository  extends JpaRepository<Product , Integer>{

    List<Product> findAllByIdInOrderById(List<Integer> ids);
    
}
