package com.thanuja.restws;

import java.util.Arrays;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.thanuja.restws")
public class RestattachmentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestattachmentsApplication.class, args);
	}
	@Autowired
	   private Bus bus;

	@Bean
	   public Server rsServer() {
	       JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
	       endpoint.setBus(bus);
	       endpoint.setServiceBeans(Arrays.<Object>asList(new FileService()));
	       endpoint.setAddress("/");
	       return endpoint.create();
	   }

}
