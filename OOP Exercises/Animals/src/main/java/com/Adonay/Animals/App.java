package com.Adonay.Animals;

/**
 * Animals In the zoo
 *
 */
public class App {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		Animal sammy = new Salmon("Fish", "sammy", 0);
		Dog spot = new Dog("Mamal", "spot", 4, "John");
		Human adam = new Human("Mamal", "adam", 2, "Chinese");
		Dog snowball = new Dog("Mamal", "snowball", 4, "adam");
		Human john = new Human("Mamal", "John", 2, "Jamaica");
		
		snowball.speak();
		sammy.move();
		adam.move();
		spot.move();
		john.tellDogToSpeak(spot);
		adam.killAnimal(sammy);
		adam.killAnimal(spot);
		john.killAnimal(snowball);
		


	}
}
