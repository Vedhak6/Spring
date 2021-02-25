package com.xworkz.shop.dao;

import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.shop.entity.ShopEntity;
import com.xworkz.singleconnection.SingleSessionFactory;

public class ShopDAOimpl implements ShopDAO{

	public ShopDAOimpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	
SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

	@Override
	public Long saveShop(ShopEntity shopEntity) {

		System.out.println("invoked saveShop");
		
		Transaction transaction= null;
		SessionFactory factory = sessionFactory;
		try(Session session =  factory.openSession()){
			transaction = session.getTransaction();
			session.beginTransaction();
			session.save(shopEntity);
			session.getTransaction().commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}
		
		return null;
	}}






