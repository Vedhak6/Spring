package com.xworkz.projector.custom;

public class Ball {
	
	private String type;
	private double weight;
	private String usedFor;
	
	public Ball() {
		
	}

	public Ball(String type, String usedFor) {
		super();
		this.type = type;
		this.usedFor = usedFor;
	}

	public Ball(String type, double weight) {
		super();
		this.type = type;
		this.weight = weight;
	}
	
	public Ball( double weight,String type) {
		super();
		this.weight = weight;
		this.type = type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	@Override
	public String toString() {
		return "Ball [type=" + type + ", weight=" + weight + ", usedFor=" + usedFor + "]";
	}
	
	
	
	
}
