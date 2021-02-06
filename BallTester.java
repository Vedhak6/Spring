package com.xworkz.projector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.projector.custom.Ball;

public class BallTester {

	public static void main(String[] args) {
		
		String metaInfoFile="ball.xml";
		ApplicationContext spring=new ClassPathXmlApplicationContext(metaInfoFile);
		
		
		Ball b=spring.getBean(Ball.class);
		
		
		System.out.println(b);

	}

}
