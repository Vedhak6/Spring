package com.xworkz.entity;

public class ComputerEntity {
	
	private String brand;
	private int price;
	
	
	public ComputerEntity() {
		super();
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ComputerEntity(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "ComputerEntity [brand=" + brand + ", price=" + price + "]";
	}
	
	

}
