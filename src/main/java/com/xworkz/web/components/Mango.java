package com.xworkz.web.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Mango {
	
	public Mango() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}

	@RequestMapping("/clickme.odc")
	public String onClick(@RequestParam("price")double price,@RequestParam("destination")String destination)
	{
		System.out.println("invoked on click ");
		System.out.println("price :" +price);
		System.out.println("destination :" +destination);
		return "/index.jsp";
	}

	

	
}
