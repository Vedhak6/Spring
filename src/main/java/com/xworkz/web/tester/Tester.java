package com.xworkz.web.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.web.components.Register;
import com.xworkz.web.dto.RegisterDTO;
import com.xworkz.web.service.RegisterServiceImpl;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext container=new  ClassPathXmlApplicationContext("dsServlet-servlet.xml");
	//	RegisterServiceImpl reg= container.getBean(RegisterServiceImpl.class);
	//	reg.validation(new RegisterDTO("vedha","ved@gmail.com","ved","ved"));
		
		Register reg=container.getBean(Register.class);
		reg.saveRegister(new RegisterDTO("vedha","ved@gmail.com","ved","ved"));

	}

}
