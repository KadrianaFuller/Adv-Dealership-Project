package com.yearup.dealership;

public class Program {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        userInterface.display();

        Vehicle tayVehicle = new Vehicle("000000",2025,"Kia","K5","Sadan","Matte Black",20,10000);

       SalesContract contract = new SalesContract("10/10/24","Albert","A@gmail.com",tayVehicle,10000,300,3.0,100,295,true);
    }


}
