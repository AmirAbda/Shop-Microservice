package com.amir.product_microservice.service;

import org.springframework.stereotype.Service;

import com.amir.product_microservice.dto.ProductRequest;
import com.amir.product_microservice.mapper.ProductMapper;
import com.amir.product_microservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    // create a product method
    public Integer createProduct(ProductRequest req) {
        var product = mapper.toProduct(req);
        return repository.save(product).getId();
    }
    
}
