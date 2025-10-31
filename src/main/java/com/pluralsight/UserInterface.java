package com.pluralsight;

import java.util.Scanner;

public class UserInterface {

    private static final Scanner scanner = new Scanner(System.in);

    public void display() {

        boolean running = true;

        while (running) {

            displayHomeScreenMenu(); // calls method that displays menu
            String choice = scanner.nextLine().trim();

            switch(choice) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:


            }
        }

    }

    public void displayHomeScreenMenu() {
        System.out.println("==== Dealership Menu ====");
        System.out.println("\n ╔══════════════════ Display Menu ════════════════════╗");
        System.out.println(" ║ (1) Find vehicles within a price range");
        System.out.println(" ║ (2) Find vehicles by make/model");
        System.out.println(" ║ (3) Find vehicles by year range");
        System.out.println(" ║ (4) Find vehicles by color");
        System.out.println(" ║ (5) Find vehicles by mileage range");
        System.out.println(" ║ (6) Find vehicles by type(car, truck, SUV, van)");
        System.out.println(" ║ (7) List ALL vehicles");
        System.out.println(" ║ (8) Add a vehicle");
        System.out.println(" ║ (9) Remove a vehicle");
        System.out.println(" ║ (99) Quit"); //Exit the program application
        System.out.println(" ╚══════════════════════════════════════════════════════╝");
        System.out.print(" Enter choice: ");
    }

    private void processGetByPriceRequest() {

    }
    private void processGetByMakeModelRequest() {

    }
    private void processGetByYearRequest() {

    }
    private void processGetByColorRequest() {

    }
    private void processGetByMileageRequest() {

    }
    private void processGetByVehicleTypeRequest() {

    }
    private void processGetAllVehiclesRequest() {

    }

    private void processAddVehicleRequest() {
    }

    private void processRemoveVehicleRequest() {
    }
}
