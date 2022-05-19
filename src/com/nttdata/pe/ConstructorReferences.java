package com.nttdata.pe;

interface Factory2 {
	Vehicle2 prepare(String make, String model, int year);
}

class Vehicle2 {
	private String make;
	private String model;
	private int year;

	Vehicle2(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String toString() {
		return "Vehicle[" + make + ", " + model + ", " + year + "]";
	}
}

public class ConstructorReferences {

	static Vehicle2 factory(Factory2 factoryObj, String make, String model, int year) {
		return factoryObj.prepare(make, model, year);
	}

	public static void main(String[] args) {
		// Constructor reference
		Factory2 vehicle_factory = Vehicle2::new;
		Vehicle2 carHonda = factory(vehicle_factory, "Honda", "Civic", 2017);
		System.out.println(carHonda);
	}

}
