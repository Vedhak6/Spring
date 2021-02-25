package com.xworkz.tester;

import com.xworkz.shop.dao.ShopDAO;
import com.xworkz.shop.dao.ShopDAOimpl;
import com.xworkz.shop.entity.ShopEntity;

public class ShopTester {

	public static void main(String[] args) {
		
		  ShopEntity shopEntity = new ShopEntity("Shop-1","Bangalore","vedha",true);
			 
			 ShopDAO shopDAO = new ShopDAOimpl();
			 shopDAO.saveShop(shopEntity);
			

	}

}

