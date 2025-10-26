package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DealershipFileManager {

    // method to read the inventory.csv file
    public Dealership getDealership() {
        Dealership dealership = new Dealership();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"));
            String line;
            reader.readLine(); // important to skip the dealership header of the inventory.csv file

//            ArrayList<Vehicle> vehicles = new ArrayList<>();

            while ((line = reader.readLine()) != null) { // keeps reading until readLine() returns null
                String[] partsOfVehicleData = line.split("\\|");
                if (partsOfVehicleData.length == 8) { // use if statement to make sure there are 8 parts
                    int vin = Integer.parseInt(partsOfVehicleData[0].trim()); // parse vin string to int
                    int year = Integer.parseInt(partsOfVehicleData[1].trim()); //parse year string to int
                    String make = partsOfVehicleData[2].trim();
                    String model = partsOfVehicleData[3].trim();
                    String vehicleType = partsOfVehicleData[4].trim();
                    String color = partsOfVehicleData[5].trim();
                    int odometer = Integer.parseInt(partsOfVehicleData[6].trim()); //parse odometer (mileage) string to int
                    double price = Double.parseDouble(partsOfVehicleData[7].trim()); // parse price string to double

                    //creates a new vehicle data transaction object with this data and adds it to the ArrayList
//                    Vehicle vehicle = new Vehicle(vin,year,make, model, vehicleType, color, odometer, price);
//                    vehicles.add(vehicle);
                    dealership.addVehicle(new Vehicle(vin,year,make, model, vehicleType, color, odometer, price));
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error reading inventory.csv file: " + e.getMessage());
            // e.printStackTrace();
        }
        return dealership;
    }

    public void saveDealership() {

    }
}
