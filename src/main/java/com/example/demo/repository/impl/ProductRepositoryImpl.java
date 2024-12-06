package com.example.demo.repository.impl;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public ProductEntity create(ProductEntity productEntity) {
        ProductEntity newProductEntity = new ProductEntity();
        newProductEntity.setId(1L);
        newProductEntity.setProductName("Tips java");
        newProductEntity.setProductPrice(new BigDecimal("12.0"));
        return newProductEntity;
    }

    @Override
    public List<ProductEntity> findAll() {
        ProductEntity newProductEntity = new ProductEntity();
        newProductEntity.setId(1L);
        newProductEntity.setProductName("Tips java");
        newProductEntity.setProductPrice(new BigDecimal("12.0"));
        return List.of(newProductEntity);
    }
}
