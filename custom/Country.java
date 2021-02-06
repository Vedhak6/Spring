package com.xworkz.projector.custom;

public class Country {

	private String primeMinister;
	private String president;
	private String capital;
	private String population;
	private int noOfStates;
	
	
	public Country(){
		
	}

	public Country(String primeMinister) {
		super();
		this.primeMinister = primeMinister;
	}

	

	public void setPrimeMinister(String primeMinister) {
		this.primeMinister = primeMinister;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}


	public void setPopulation(String population) {
		this.population = population;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	@Override
	public String toString() {
		return "Country [primeMinister=" + primeMinister + ", president=" + president + ", capital=" + capital
				+ ", population=" + population + ", noOfStates=" + noOfStates + "]";
	}
	
	
}
