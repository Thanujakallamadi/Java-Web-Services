package com.thanuja.ws.soap.config;


import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thanuja.ws.soap.FileWsImpl;



@Configuration
public class WebServiceConfig {
	
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint endpoint() {
		Endpoint endpoint=new EndpointImpl(bus, new FileWsImpl());
		endpoint.publish("/fileWs");
		
		SOAPBinding binding=(SOAPBinding)endpoint.getBinding();
		binding.setMTOMEnabled(true);
		return endpoint;
	}
	
}
