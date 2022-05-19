package com.nttdata.pe;

interface Factory {
	Vehicle prepare(String make, String model, int year);
}

class Vehicle {
	private String make;
	private String model;
	private int year;

	Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String toString() {
		return "Vehicle[" + make + ", " + model + ", " + year + "]";
	}
}

class VehicleFactory {
	static Vehicle prepareVehicleInStaticMode(String make, String model, int year) {
		return new Vehicle(make, model, year);
	}

	Vehicle prepareVehicle(String make, String model, int year) {
		return new Vehicle(make, model, year);
	}
}

public class MethodReferences {

	public static void main(String[] args) {
		// Method Reference - Static way
		Factory vehicle_factory_static = VehicleFactory::prepareVehicleInStaticMode;
		Vehicle carHyundai = vehicle_factory_static.prepare("Hyundai", "Verna", 2018);
		System.out.println(carHyundai);

		// Method Reference - Instance way
		Factory vehicle_factory_instance = new VehicleFactory()::prepareVehicle;
		Vehicle carTata = vehicle_factory_instance.prepare("Tata", "Harrier", 2019);
		System.out.println(carTata);
	}

}
