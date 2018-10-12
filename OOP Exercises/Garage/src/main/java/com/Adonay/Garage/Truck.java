package com.Adonay.Garage;

public class Truck extends Vehicle{
	private int weightItCanLift;

	public Truck(int numberOfWheels, String name, boolean isRaceCar, int weightItCanLift) {
		super(numberOfWheels, name, isRaceCar);
		this.weightItCanLift = weightItCanLift;

	}

	public int getWeightItCanLift() {
		return weightItCanLift;
	}

	public void setWeightItCanLift(int weightItCanLift) {
		this.weightItCanLift = weightItCanLift;
	}

}