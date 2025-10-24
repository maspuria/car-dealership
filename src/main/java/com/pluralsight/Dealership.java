package com.pluralsight;

import java.util.ArrayList;

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

}
