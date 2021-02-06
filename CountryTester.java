package com.xworkz.projector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.projector.custom.Country;

public class CountryTester {

	public static void main(String[] args) {
		
		String metaInfoFile="country.xml";
		ApplicationContext spring=new ClassPathXmlApplicationContext(metaInfoFile);
		
		
		Country c=spring.getBean(Country.class);
		
		
		System.out.println(c);

	}

}
