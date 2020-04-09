package com.thanuja.restws.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thanuja.restws.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
