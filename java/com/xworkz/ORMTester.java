package com.xworkz;

import java.util.Arrays;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.crop.cropenum.CropSeason;
import com.xworkz.crop.cropenum.CropType;
import com.xworkz.crop.dao.CropDAO;
import com.xworkz.crop.entity.CropEntity;

public class ORMTester {

	public static void main(String[] args) {
		
        String filePath = "application.xml";
		
		ApplicationContext container = new ClassPathXmlApplicationContext(filePath);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		CropDAO cropDAO = container.getBean(CropDAO.class);
		CropEntity cropEntity =  new CropEntity("Rice", CropType.Kharif, 40.0, CropSeason.Rainy, true, 5);
		cropDAO.saveCrop(cropEntity);
		
		

	}

}
