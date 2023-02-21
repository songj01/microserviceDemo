package com.sjiang.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sjiang.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
