package com.xworkz.mall;

import org.springframework.stereotype.Component;

@Component
public class ManualParkingLot implements ParkingLot {

	
	public ManualParkingLot() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	
	@Override
	public boolean isAvail() {
		System.out.println("manual");
		return true;
	}
	

}
