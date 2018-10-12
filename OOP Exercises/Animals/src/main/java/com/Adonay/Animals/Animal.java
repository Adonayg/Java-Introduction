package com.Adonay.Animals;

public class Animal {

	private String Type;
	private String name;
	private int numberOfLegs;
	
	public Animal(String Type, String name, int numberOfLegs) {
		this.Type = Type;
		this.name = name;
		this.numberOfLegs = numberOfLegs;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	
	public void eat() {
		
	}
	
	public void move() {
		
	}
	
	

}
