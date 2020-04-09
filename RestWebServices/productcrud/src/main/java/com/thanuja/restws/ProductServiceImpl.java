package com.thanuja.restws;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.thanuja.restws.entities.Product;
import com.thanuja.restws.repos.ProductRepository;


public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository repository;
	
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public Response createProduct(Product product) {
		// TODO Auto-generated method stub
		 Product savedProduct = repository.save(product);
		 return Response.ok(savedProduct).build();
	}

	@Override
	public Response updateProduct(Product product) {
		// TODO Auto-generated method stub
		Product savedProduct = repository.save(product);
		return Response.ok(savedProduct).build();
	}

}
