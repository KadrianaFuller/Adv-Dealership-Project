package com.yearup.dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name, address, phone;
    private List<Vehicle> vehicles;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = new ArrayList<>();
    }
    public Dealership () {
        vehicles = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getAllVehicles () {
        return vehicles;
    }

    public void getVehiclesByPrice (double min, double max) {
    }
    public void getVehiclesByMakeModel (String make, String model) {
    }
    public void getVehiclesByYear (double min, double max) {
    }
    public void getVehiclesByColor (String color) {

    }
    public void getVehiclesByMileage (double min, double max) {
    }
    public void getVehiclesByType (String vehicleType) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
