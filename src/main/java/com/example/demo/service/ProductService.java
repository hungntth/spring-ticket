package com.example.demo.service;

import com.example.demo.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    ProductEntity create(ProductEntity product);

    List<ProductEntity> findAll();
}
