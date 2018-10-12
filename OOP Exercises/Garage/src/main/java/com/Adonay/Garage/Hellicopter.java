package com.Adonay.Garage;

public class Hellicopter extends Vehicle{
	private int numberOfBlades;
	
	public Hellicopter(int numberOfWheels, String name, boolean isRaceCar, int numberOfBlades) {
		super(numberOfWheels, name, isRaceCar);
		this.setNumberOfBlades(numberOfBlades);

	}

	public int getNumberOfBlades() {
		return numberOfBlades;
	}

	public void setNumberOfBlades(int numberOfBlades) {
		this.numberOfBlades = numberOfBlades;
	}


	

}
