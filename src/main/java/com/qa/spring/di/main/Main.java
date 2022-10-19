package com.qa.spring.di.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qa.spring.di.beans.Address;
import com.qa.spring.di.beans.Employee;
import com.qa.spring.di.config.BeanConfiguration;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(new Class[] {BeanConfiguration.class});
		/*
		 * Address address = context.getBean("homeaddress",Address.class);
		 * System.out.println(address); Employee emp1 = context.getBean(Employee.class);
		 * System.out.println(emp1);
		 */
		
		  Address homeaddress = context.getBean("homeaddress",Address.class);
		  System.out.println(homeaddress);
		  
		  Address homeaddress2 = context.getBean("homeaddress",Address.class);
		  System.out.println(homeaddress2);
		  
		  System.out.println(homeaddress == homeaddress2);
		  
		  Address officeaddress = context.getBean("officeaddress",Address.class);
		  System.out.println(officeaddress);
		 
	}

}
