package com.qa.spring.di.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Component
@Scope("prototype")
@Lazy
public class Employee {

	private int id;		
	private String name;
	private double salary;
	
	/*
	@Autowired //Property DI
	private Address address;
 */
	@Autowired
	private List<Address> addressList;
	
	
	/*
	 * @Autowired public Employee(@Qualifier("homeaddress") Address address) {
	 * System.out.println("Employee constructor invoked.."); this.address = address;
	 * }
	 */
	
	
	
	
	

}
