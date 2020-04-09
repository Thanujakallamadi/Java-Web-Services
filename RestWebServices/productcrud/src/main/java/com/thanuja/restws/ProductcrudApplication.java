package com.thanuja.restws;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductcrudApplication.class, args);
	}

	@Autowired
	private Bus bus;

	@Bean
	public Server rsServer() {
		JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJaxbJsonProvider());		
		endpoint.setProviders(providers);
		endpoint.setBus(bus);
		endpoint.setServiceBeans(Arrays.<Object>asList(new ProductServiceImpl()));
		endpoint.setAddress("/");
		return endpoint.create();
	}

}
