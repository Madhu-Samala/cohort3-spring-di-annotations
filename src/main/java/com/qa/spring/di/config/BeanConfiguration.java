package com.qa.spring.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.qa.spring.di.beans.Address;

@Configuration

@ComponentScan(basePackages = "com.qa.spring.di")
public class BeanConfiguration {

	// factory methods
	/*
	 * @Bean(name = "emp1") public Employee getEmployee() { return new
	 * Employee(111,"emp1",234234.23,Arrays.asList(getHomeAddress(),getOfficeAddress
	 * ())); }
	 */

	@Bean(name = "homeaddress", initMethod = "init", destroyMethod = "destroy")
	@Scope("prototype")
	@Lazy
	public Address getHomeAddress() {
		return new Address().builder().houseNo("1-11").street("Church Street").zipCode(2342342).build();
	}

	@Bean(name = "officeaddress")
	public Address getOfficeAddress() {
		return new Address().builder().houseNo("1-22").street("Beach Street").zipCode(3342342).build();
	}

}
