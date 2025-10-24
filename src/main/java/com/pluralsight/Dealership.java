package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    // field members
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Vehicle> vehicles;

    // constructor
    public Dealership(String name, String address, String phoneNumber, ArrayList<Vehicle> vehicles) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.vehicles = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    // overloaded methods
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        return null; //temporary
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null; //temporary
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        return null; //temporary
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return null; //temporary
    }

    public List<Vehicle> getVehiclesByMileage(int min, int  max) {
        return null; //temporary
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return null; //temporary
    }

    // method to display all vehicles in the transaction.csv file
    public List<Vehicle> getAllVehicles() {
        return null; //temporary
    }

    // method to add vehicles to the transaction.csv file
    public void addVehicle(Vehicle vehicle) {

    }

    //method to remove a vehicle data transaction from teh transaction.csv file
    public void removeVehicle(Vehicle vehicle) {

    }

}
