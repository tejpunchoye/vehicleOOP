package oop;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Vehicles {
	private String vehicleType;
	private int transporting; // Number of a people in the vehicle
	private double maxSpeed; // Max speed of the vehicle
	public ArrayList<String> safetyFeaturesCar = new ArrayList<>(Arrays.asList("Seatbelts, ", "Airbags, ", "Anti-Locks Brake, ", "Electronic Stability Control."));
	public ArrayList<String> safetyFeaturesBoat = new ArrayList<>(Arrays.asList("Life jackets, ", "Fire Extinguishers, ", "Navigation Light, ", "GPS."));
	public ArrayList<String> safetyFeaturesPlane = new ArrayList<>(Arrays.asList("Flight data recorder, ", "EGPSW, ", "Emergency Oxygen mask."));
	
	public void setVehicleType(Object vehicleType) {
		// Check for the max speed depending of type of vehicle - mph
		this.vehicleType = vehicleType.toString();
	}
	public String getVehicleType() {
		return this.vehicleType;
	}
	
	public void setTransporting(int transporting) {
		// All vehicle can transporting people - using accessor(getter) and
		// mutator(setter) method.
		// Can be use to check max capacity of passenger
		this.transporting = transporting;
	}

	public int getTransporting() {
		return this.transporting;
	}

	
	public double getMaxSpeed() {
		double maxSpeed = 0.0;
		// car, Boat, Plane
		switch (vehicleType) {
		case "car":
			maxSpeed = 186.0;
			break;
		case "boat":
			maxSpeed = 46.0;
			break;
		case "plane":
			maxSpeed = 965.0;
			break;
		}
		return maxSpeed;
	}

	public double getloadingCapacity() {
		// Max load the vehicle can carry depending on the type of vehicle - kg
		double loadingCapacity= 0.0;
		switch (vehicleType) {
		case "car":
			loadingCapacity = 1361;
			break;
		case "boat":
			loadingCapacity = 10000;
			break;
		case "plane":
			loadingCapacity = 20000;
			break;	
		}
		return loadingCapacity;
	}

	public void maneuve(Object maneuve) {
		// All vehicle can change direction except plane cannot reverse
		switch (maneuve.toString()) {
		case "right":
			System.out.println("Vehicle turning right");
			break;
		case "left":
			System.out.println("Vehicle turing left");
			break;
		case "forward":
			System.out.println("Vehicle moving forward");
			break;

		case "reverse":
			System.out.println("Vehicle moving backward");
			break;
		}
	}

	public String getSecurityFeatures() {
		String safetyFeatures = "";
		switch(this.vehicleType) {
		case "car":
			for(String c: safetyFeaturesCar) {
				safetyFeatures = safetyFeatures.concat(c + " ");
			}
			break;
		case "boat":
			for(String b: safetyFeaturesBoat) {
				safetyFeatures = safetyFeatures.concat(b);
			}
			break;
		case "plane":
			for(String p: safetyFeaturesPlane) {
				safetyFeatures = safetyFeatures.concat(p);
			}
			break;
		}
		return safetyFeatures;
	}
	
	
	public void methodOverloading(int a) {
		System.out.println("First method");
	}
	
	public void methodOverloading(int a, int b) {
		System.out.println("Second method");
	}
	private String powerSource = ""; // Combusion engine, Diesel Engine,Electric Engine
	private String steeringSys = "";
	private String Transmission = ""; //Planes does not have transmission
	
	
	
	public abstract void powerSource();

	public abstract void wheels(); // Check the number of wheel depending on the type of vehicle

	public abstract void brakes(); // Type of braking system - Hydraulic, Electric

	public abstract void fuelSystem();

	public abstract void electricalSystem();

	public abstract void interior();
	
	
}
