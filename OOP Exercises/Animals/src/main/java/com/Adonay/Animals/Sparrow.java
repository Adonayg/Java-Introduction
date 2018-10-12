package com.Adonay.Animals;

public class Sparrow extends Animal implements flyable{

	public Sparrow(String Type, String name, int numberOfLegs) {
		super(Type, name, numberOfLegs);

	}

	public void fly() {
		System.out.println(getName() + " is flying ...");
		
	}
	
	public void move() {
		fly();
	}

}
