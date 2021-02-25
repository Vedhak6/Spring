package com.xworkz.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.service.ShopService;
import com.xworkz.shop.entity.ShopEntity;

public class ShopSeviceTester {

	public static void main(String[] args) {
		
		String xmlFilePath = "spring/application.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(xmlFilePath);
		
		ShopService shopService = container.getBean(ShopService.class);
		shopService.validateAndSave(new ShopEntity("Shop-3","Bangalore","chaithra",true));
		
	

	}

}
