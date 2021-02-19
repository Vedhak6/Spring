package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.crop.cropenum.CropSeason;
import com.xworkz.crop.cropenum.CropType;
import com.xworkz.crop.entity.CropEntity;
import com.xworkz.service.CropService;

public class CropServiceTester {

	public static void main(String[] args) {
		
		
		
		String xmlFilePath = "spring/application.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(xmlFilePath);
		
		CropService cropService = container.getBean(CropService.class);
		cropService.validateAndSave(new CropEntity("rice", CropType.Kharif, 30, CropSeason.Rainy, true, 3));
		
	

	}

}


//CropService cropservice=new CropServiceImpl();
//
//CropEntity cropentity=new CropEntity();
//
//cropservice.validateAndSave(cropentity);