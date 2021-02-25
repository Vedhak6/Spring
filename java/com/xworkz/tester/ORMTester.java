package com.xworkz.tester;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.shop.dao.ShopDAO;
import com.xworkz.shop.entity.ShopEntity;

public class ORMTester {

	public static void main(String[] args) {
		
		 String filePath = "spring/application.xml";
			
			ApplicationContext container = new ClassPathXmlApplicationContext(filePath);
			System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
			ShopDAO shopdao=container.getBean(ShopDAO.class);
			ShopEntity shopentity = new ShopEntity("Shop-2","Bangalore","sindu",true);
			
			shopdao.saveShop(shopentity);

	}

}
