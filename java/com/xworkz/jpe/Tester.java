package com.xworkz.jpe;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.entity.ComputerEntity;
import com.xworkz.entity.MouseEntity;

public class Tester {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPAExample");
        System.out.println(factory);
        
        EntityManager entitymanager=factory.createEntityManager();
        MouseEntity mouseentity= new MouseEntity();
        mouseentity.setBrand("Dell");
        mouseentity.setPrice(40000);
        entitymanager.getTransaction().commit();
        Query query=entitymanager.createNamedQuery("findAll");
        List<ComputerEntity> computerEntities=query.getResultList();
        System.out.println(computerEntities);
        entitymanager.close();
        factory.close();
        
        
	}

}
