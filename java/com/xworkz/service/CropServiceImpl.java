package com.xworkz.service;

import com.xworkz.crop.dao.CropDAO;
import com.xworkz.crop.entity.CropEntity;

public class CropServiceImpl implements CropService {

	private CropDAO cropDAO;
	
	public CropServiceImpl(CropDAO cropDAO) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.cropDAO=cropDAO;
	}

	
	
	@Override
	public boolean validateAndSave(CropEntity cropentity) {
		System.out.println("invoked validateAndSave");
		System.out.println("cropEntity "+cropentity);
		boolean valid = false;
		if(cropentity !=null) {
			String name = cropentity.getName();
		
			if(name!=null && !name.isEmpty() && name.length()<15) {
				System.out.println("name is valid");
				valid=true;
			} else {
				System.out.println("name is invalid");
				valid=false;
			}
			if(valid) {
			double price = cropentity.getPrice();
			if(price>10 && price<1000) {
				System.out.println("price is valid");
				valid=true;
			}else {
				System.out.println("price is invalid,price should be greater than 10");
				valid=false;
			}
		  }
		if(valid) {
			System.out.println("crop is valid, can save");
			cropDAO.saveCrop(cropentity);
		} else {
			System.out.println("crop is invalid cant save");
		}
			
	
		}
		return valid;
	}
}
