package com.xworkz.mall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MallTester {

	public static void main(String[] args) {
		
		ApplicationContext container=new  ClassPathXmlApplicationContext("spring.xml");
		Mall mall=(Mall) container.getBean(Mall.class);
		System.out.println(mall);
		mall.parking();
	    
	}
}