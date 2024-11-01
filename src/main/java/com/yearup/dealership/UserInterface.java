package com.yearup.dealership;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public Dealership dealership;
    public static Scanner scan = new Scanner(System.in);
    private List<Vehicle> vehicles;

    private void init() {
        dealership = DealershipFileManager.getDealership();

    }

    public void display() {
        init();


        while (true) {
            displayMenu();
            String userOptions = scan.nextLine();

            switch (userOptions) {

                case "1":
                    viewAllVehicles();
                    break;
                case "2":
                    searchCriteria();
                    break;
                case "3":
                    saleOrLease();
                    break;
                case "4":
                    System.out.println("Thank you for choosing TK Auto. We hope to see you soon! Goodbye.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option chosen, try again");
            }

        }

    }

    private void saleOrLease() {
    }

    public void processAllVehiclesRequest() {
        List<Vehicle> vehicles = dealership.getAllVehicles();
        for (Vehicle vehicle : vehicles) {
            displayVehicles(vehicles); // Display each vehicle using the helper method
        }
    }

    private void displayVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

    }

    public void viewAllVehicles() {
        List<Vehicle> allVehicles = dealership.getAllVehicles();
        displayVehicles(allVehicles);
    }

    public void processGetByPriceRequest() {
        System.out.println("Enter minimum price:");
        double minPrice = scan.nextDouble();
        System.out.println("Enter maximum price:");
        double maxPrice = scan.nextDouble();
        scan.nextLine(); // Consume newline

        List<Vehicle> vehiclesByPrice = dealership.getVehiclesByPrice(minPrice, maxPrice);
        displayVehicles(vehiclesByPrice);
    }

    public void processGetByMakeModelRequest() {
        System.out.println("Enter vehicle make:");
        String make = scan.nextLine();
        System.out.println("Enter vehicle model:");
        String model = scan.nextLine();

        List<Vehicle> vehiclesByMakeModel = dealership.getVehiclesByMakeModel(make, model);
        displayVehicles(vehiclesByMakeModel);
    }

    public void processGetByYearRequest() {
        System.out.println("Enter the year of the vehicle:");
        int year = scan.nextInt();
        scan.nextLine(); // Consume newline

        List<Vehicle> vehiclesByYear = dealership.getVehiclesByYear(year);
        displayVehicles(vehiclesByYear);
    }

    public void processGetByColorRequest() {
        System.out.println("Enter the color of the vehicle:");
        String color = scan.nextLine();

        List<Vehicle> vehiclesByColor = dealership.getVehiclesByColor(color);
        displayVehicles(vehiclesByColor);
    }

    public void processGetByMileageRequest() {
        System.out.println("Enter maximum mileage:");
        int maxMileage = scan.nextInt();
        scan.nextLine(); // Consume newline

        List<Vehicle> vehiclesByMileage = dealership.getVehiclesByMileage(maxMileage);
        displayVehicles(vehiclesByMileage);
    }

    public void processGetByVehicleTypeRequest() {
        System.out.println("Enter the type of vehicle (e.g., Sedan, SUV, etc.):");
        String vehicleType = scan.nextLine();

        List<Vehicle> vehiclesByType = dealership.getVehiclesByType(vehicleType);
        displayVehicles(vehiclesByType);
    }

    public void processGetAllVehicleRequest() {
        List<Vehicle> allVehicles= dealership.getAllVehicles();
        displayVehicles(allVehicles);
    }

    public void processAddVehicleRequest() {
        System.out.println("Enter the VIN number:");
        String vin = scan.nextLine();
        System.out.println("Enter the year:");
        int year = scan.nextInt();
        scan.nextLine(); // Consume newline
        System.out.println("Enter the make:");
        String make = scan.nextLine();
        System.out.println("Enter the model:");
        String model = scan.nextLine();
        System.out.println("Enter the type (e.g., Sedan, SUV):");
        String vehicleType = scan.nextLine();
        System.out.println("Enter the color:");
        String color = scan.nextLine();
        System.out.println("Enter the odometer reading:");
        int odometer = scan.nextInt();
        System.out.println("Enter the price:");
        double price = scan.nextDouble();
        scan.nextLine(); // Consume newline

        Vehicle newVehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
        dealership.addVehicle(newVehicle);
        System.out.println("Vehicle added successfully!");

    }

    public void processRemoveVehicleRequest() {

    }

    private void searchCriteria() {
    }

    public void displayMenu() {
        System.out.println("""
                Welcome to TK Auto!
                1.View All Vehicles
                2.Search by Criteria:
                3.Sell/Lease
                4.Exit""");

    }
}
