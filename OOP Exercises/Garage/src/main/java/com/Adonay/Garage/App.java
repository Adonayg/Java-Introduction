package com.Adonay.Garage;


/**
 * Characters from cars in a garage
 *
 */
public class App {
	public static void main(String[] args) {
		
		Vehicle dinoco = new Hellicopter(2, "Dinoco", false, 3);
		Vehicle sally = new Car(4, "Sally", false, "purple");
		Vehicle mcQueen = new Car(4, "Lightening McQueen", true, "red");
		Vehicle tractor = new Truck(4, "Tractor", false, 10);
		Vehicle snotRod = new Car(4, "Snot Rod", false, "crimson");
		Vehicle mack = new Truck(8, "Mack", false, 15);
		
		Garage adonayGarage = new Garage();
		System.out.println(mcQueen.isRaceCar());
		
		adonayGarage.addVehicle(mack);
		adonayGarage.addVehicle(sally);
		adonayGarage.addVehicle(mcQueen);
		adonayGarage.addVehicle(snotRod);
		adonayGarage.addVehicle(dinoco);
		adonayGarage.addVehicle(tractor);
		
		adonayGarage.fixVehicle(sally);
		adonayGarage.fixVehicle(mcQueen);
		
		System.out.println("Remaining cars in the vehicle list from the Garage class");
		adonayGarage.getVehicleList().forEach(i -> System.out.print(" " + i.getName()));
		System.out.println();
		
		int totalCost = adonayGarage.calculateBill(adonayGarage.getVehicleList());
		System.out.println("Total cost: " + totalCost);


		
	}
}
