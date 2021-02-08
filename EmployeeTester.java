package com.xworkz.projector;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.projector.custom.EmployeeAL;




public class EmployeeTester {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("Employee.xml");
		
        EmployeeAL employeeal= container.getBean(EmployeeAL.class);
        System.out.println( employeeal);
	}

}
