package com.xworkz.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class customerTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("util.xml");
		DriverManagerDataSource driverConnection=container.getBean(DriverManagerDataSource.class);
		try {
			Connection con=driverConnection.getConnection();
			Statement stmt=con.createStatement();
			String qry="insert into customer values('vedha',11,'Bangalore',987896778)";
			String qry1="select * from customer";
		
		ResultSet rs=	stmt.executeQuery(qry);
		while(rs.next()){
			System.out.println(rs.toString());
			
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		

	}


	}
