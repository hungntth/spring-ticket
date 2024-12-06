package com.example.demo.repository;

import com.example.demo.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {
    ProductEntity create(ProductEntity product);

    List<ProductEntity> findAll();
}
