package com.Adonay.Garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public List<Vehicle> searchVehicleList(List<Vehicle> vehicleList) {
		vehicleList.forEach(System.out::println);
		return vehicleList;
	}

	public static int costByVehicleType(Vehicle vehicle) {
		int cost = 0;
		if (vehicle instanceof Car) {
			cost = 1000;
			if (vehicle.isRaceCar()) {
				cost = 2000;
			}
		} else if (vehicle instanceof Truck) {
			cost = 1500;
		} else if (vehicle instanceof Hellicopter) {
			cost = 4000;
		} else {
			System.out.println("We don't deal with your kind of Vehicle");
			cost = 100;
		}
		return cost;
	}

	public int calculateBill(List<Vehicle> vehicleListpar) {
		int totalCost = 0;
		for (Vehicle v : vehicleListpar) {
			totalCost += costByVehicleType(v);
		}
		return totalCost;
	}

	public List<Vehicle> addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
		System.out.println(vehicle.getName() + " was added to the garage");
		return vehicleList;
	}

	public List<Vehicle> removeVehicle(Vehicle vehicle) {
		vehicleList.remove(vehicle);
		System.out.println(vehicle.getName() + " was removed from garage");
		return vehicleList;
	}

	public List<Vehicle> fixVehicle(Vehicle vehicle) {
		removeVehicle(vehicle);
		System.out.println("cost: " +  costByVehicleType(vehicle));
		return vehicleList;
	}

}