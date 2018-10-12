package com.Adonay.Animals;

public class Dog extends Animal{
	
	private String nameOfOwner;

	public Dog(String Type, String name, int numberOfLegs, String nameOfOwner) {
		super(Type, name, numberOfLegs);
		this.nameOfOwner = nameOfOwner;

	}

	public String getNameOfOwner() {
		return nameOfOwner;
	}

	public void setNameOfOwner(String nameOfOwner) {
		this.nameOfOwner = nameOfOwner;
	}
	
	public void speak() {
		System.out.println(getName() + " says woof!");
	}
	
	public void move() {
		System.out.println(getName() + " is running ...");
	}

}
