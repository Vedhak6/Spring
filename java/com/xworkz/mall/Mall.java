package com.xworkz.mall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mall {
	
	@Autowired
	@Qualifier("autoParkingLot")
	private ParkingLot parkinglot;
	
	public Mall() {
		System.out.println("Created "+this.getClass().getName());
	}
	
	
	public void parking() {
		boolean av = this.parkinglot.isAvail();
		if(av)
			System.out.println("parking available");
		else
			System.out.println("parking not availble");
		
	}
	
}
