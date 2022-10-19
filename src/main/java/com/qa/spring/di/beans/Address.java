package com.qa.spring.di.beans;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Address {
	
	private String houseNo;
	private String street;
	private int zipCode;	
	
	public void init() {
		System.out.println("init method");
	}
	public void destroy() {
		System.out.println("destroy method");
	}
	

}
