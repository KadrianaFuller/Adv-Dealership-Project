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
                    System.out.println("Thank you for choosing TK Auto. We hope to see you soon! Goodbye.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option chosen, try again");
            }

        }

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


    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByColorRequest() {

    }

    public void processGetByMileageRequest() {

    }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehicleRequest() {

    }

    public void processAddVehicleRequest() {

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
                3.Exit""");

    }
}
