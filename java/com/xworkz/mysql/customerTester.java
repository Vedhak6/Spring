package com.xworkz.mysql;

import java.sql.Connection;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class customerTester {

	public static void main(String[] args) throws SQLException {
		
		String contextConfigLocation = "database.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(contextConfigLocation);
		System.out.println(container);
		DriverManagerDataSource dm = container.getBean(DriverManagerDataSource.class);

		Connection connection = dm.getConnection();
		System.out.println(connection);

	
		

	}


	}

//ApplicationContext container=new ClassPathXmlApplicationContext("database.xml");
//DriverManagerDataSource driverConnection=container.getBean(DriverManagerDataSource.class);
//try {
//	Connection con=driverConnection.getConnection();
//	Statement stmt=con.createStatement();
//	String qry="insert into customer values('vedha',11,'Bangalore',987896778)";
//	
//
//ResultSet rs=	stmt.executeQuery(qry);
//while(rs.next()){
//	System.out.println(rs.toString());
//	
//}
//	
//} catch (SQLException e) {
//	e.printStackTrace();
//}
