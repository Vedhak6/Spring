package com.xworkz.employee;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTester extends Employee {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new  ClassPathXmlApplicationContext("Employee.xml");
		Employee e=(Employee) context.getBean(Employee.class);
		System.out.println(e);
		context.close();
		
		
	}

}
