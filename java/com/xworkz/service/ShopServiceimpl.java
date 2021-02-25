package com.xworkz.service;

import com.xworkz.shop.dao.ShopDAO;
import com.xworkz.shop.entity.ShopEntity;

public class ShopServiceimpl implements ShopService {
private ShopDAO shopdao;
	
	public ShopServiceimpl(ShopDAO shopdao) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.shopdao=shopdao;
	}
	
	@Override
	public boolean validateAndSave(ShopEntity shopentity) {
		System.out.println("invoked validateAndSave");
		System.out.println("shopEntity "+shopentity);
		boolean valid = false;
		if(shopentity !=null) {
			String name = shopentity.getShopName();
		
			if(name!=null && !name.isEmpty() && name.length()<12 && name.length()>3) {
				System.out.println("name is valid");
				valid=true;
			} else {
				System.out.println("name is invalid");
				valid=false;
			}
			if(valid) {
			String location=shopentity.getLocation();	
			
			if(location!=null && location.length()<30 && location.length()>3) {
				System.out.println("location is valid");
				valid=true;
			}else {
				System.out.println("location is invalid,location should be greater than 3");
				valid=false;
			}
		  }
			
			if(valid) {
				String oname = shopentity.getOwnerName();
			
				if(!oname.isEmpty() && oname.length()<12 && oname.length()>4) {
					System.out.println("ownername is valid");
					valid=true;
				} else {
					System.out.println("ownername is invalid");
					valid=false;
				}
			
			if(valid) {
				boolean open=shopentity.isOpen();
				if(open==true) {
				System.out.println("shop is " + 1);	
				valid=true;
			}else {
				System.out.println("shop is " +0);
				valid=false;
			}
			
		if(valid) {
			System.out.println("shop is valid, can save");
			shopdao.saveShop(shopentity);
		} else {
			System.out.println("shop is invalid cant save");
		}
		
	
		}
		
	}
	
	}
		return valid;
}
}