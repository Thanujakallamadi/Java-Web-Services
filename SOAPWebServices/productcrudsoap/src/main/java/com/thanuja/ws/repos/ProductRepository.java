package com.thanuja.ws.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thanuja.ws.soap.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
