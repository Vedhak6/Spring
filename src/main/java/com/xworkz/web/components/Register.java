package com.xworkz.web.components;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.web.dto.RegisterDTO;

@Component
@RequestMapping("/")
public class Register implements RegisterDAO {
	
	public Register() {
		System.out.println("Created " +this.getClass().getSimpleName());
	}
	
	@Autowired
    private SessionFactory sessionFactory;
		
	
	@RequestMapping("/register.odc")
	public String saveRegister( @ModelAttribute RegisterDTO registerdto ) {
		System.out.println("invoked onregister");
//		model.addAttribute("Username", registerdto.getUsername());
		System.out.println(registerdto);
        Transaction transaction= null;
		
		SessionFactory factory = sessionFactory;
		try(Session session =  factory.openSession()){
			transaction = session.getTransaction();
			session.beginTransaction();
			session.save(registerdto);
			session.getTransaction().commit();
			
		}catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return "/success.jsp";
	}


	
}
