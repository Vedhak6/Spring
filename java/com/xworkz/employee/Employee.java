package com.xworkz.employee;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("request")
public class Employee {
	
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
	@PostConstruct
	public void init() throws Exception
	{
		System.out.println("Init method is set");
	}
	@PreDestroy
	public void cleanUp() throws Exception
	{
		System.out.println("Cleanup is performed");
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

}
