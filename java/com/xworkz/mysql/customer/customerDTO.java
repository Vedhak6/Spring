package com.xworkz.mysql.customer;

public class customerDTO {
	
	private String name;
	private int customer_id;
	private String city;
	private int phone_number;
	
	public customerDTO() {
		super();
	}

	public customerDTO(String name, int customer_id, String city, int phone_number) {
		super();
		this.name = name;
		this.customer_id = customer_id;
		this.city = city;
		this.phone_number = phone_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "customerDTO [name=" + name + ", customer_id=" + customer_id + ", city=" + city + ", phone_number="
				+ phone_number + "]";
	}
	
	

}
