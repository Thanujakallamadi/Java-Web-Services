package com.thanuja.ws.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.thanuja.ws.repos.ProductRepository;
import com.thanuja.ws.soap.entities.Product;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = ProductRepository.class)
public class ProductWsImpl implements ProductWs {
	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public List<Product> getProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product getProduct(int id) {
		return productRepo.findById(id).get();
	}

	@Override
	public Product createProduct(Product product) {
		
		
		return productRepo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

}
