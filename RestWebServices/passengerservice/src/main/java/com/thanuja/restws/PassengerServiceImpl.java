package com.thanuja.restws;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;

import org.springframework.stereotype.Service;

import com.thanuja.restws.model.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService {

	List<Passenger> passengers=new ArrayList<>();
	int currentId=123;
	
	@Override
	public List<Passenger> getPassengers(int start,int size) {
		// TODO Auto-generated method stub
		System.out.println(start);
		System.out.println(size);
		
		return passengers;
	}

	@Override
	public void addPassenger(String firstName, String lastName,String agent,HttpHeaders headers) {
		// TODO Auto-generated method stub
		System.out.println(firstName);
		System.out.println(lastName);
		
		System.out.println(agent);
		MultivaluedMap<String, String> allHeaders = headers.getRequestHeaders();
		Set<String> headerKeys = allHeaders.keySet();
		for(String key:headerKeys) {
			System.out.println(key);
			System.out.println(headers.getHeaderString(key));
		}
		
		Map<String, Cookie> cookies = headers.getCookies();
		Set<String> cookiekeys = cookies.keySet();
		for(String eachcookiekey:cookiekeys) {
			System.out.println("-------Cookies-----");
			System.out.println(eachcookiekey);
			System.out.println(cookies.get(eachcookiekey).getValue());
		}
		
		
	}

}
