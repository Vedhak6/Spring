package com.xworkz.mall;

import org.springframework.stereotype.Component;

@Component
public class AutoParkingLot implements ParkingLot {

	
	public AutoParkingLot() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	
	@Override
	public boolean isAvail() {
		System.out.println("Auto");
		return false;
	}
	
	

}
