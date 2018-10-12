package com.Adonay.Animals;

public class Salmon extends Animal {
	
	
	public Salmon(String Type, String name, int numberOfLegs) {
		super(Type, name, numberOfLegs);

	}
	
	public void move() {
		System.out.println(getName() + " is swimming ...");
	}
	
	public void eat() {
		System.out.println(getName() +  "is eating ...");
	}
}
