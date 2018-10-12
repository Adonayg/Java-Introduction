package com.Adonay.Animals;

public class Human extends Animal{
	
	private String placeOfBirth;

	public Human(String Type, String name, int numberOfLegs,String placeOfBirth) {
		super(Type, name, numberOfLegs);
		this.placeOfBirth = placeOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public void move() {
		System.out.println(getName() + " is running...");
	}
	
	public void tellDogToSpeak(Dog dog) {
		System.out.println(getName() + " says " + dog.getName() + " speak");
		dog.speak();
	}
	
	public void killAnimal(Animal animal) {
		System.out.println(getName() + " killed " + animal.getName());
	}
	
	public void killAnimal(Dog dog) {
		System.out.println(getName() + " Killed " + dog.getNameOfOwner() + "'s dog, " + dog.getName());
	}
}
