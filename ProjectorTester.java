package com.xworkz.projector;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.projector.custom.Projector;

public class ProjectorTester {

	public static void main(String[] args) {
		
		
		String metaInfoFile="spring.xml";
		ApplicationContext spring=new ClassPathXmlApplicationContext(metaInfoFile);
		
		
		Projector p=spring.getBean(Projector.class);
		
		p.start();
		System.out.println(p);
	}

}
