package com.yearup.dealership;

public class LeaseContract extends Contract{

    private double endingValue;
    private double leaseFee;

    public LeaseContract(String date, String customerName, String customerEmail, String vehicleSold, double endingValue, double leaseFee) {
        super(date, customerName, customerEmail, vehicleSold);
        this.endingValue = endingValue;
        this.leaseFee = leaseFee;
    }

    public double getEndingValue() {
        return endingValue;
    }

    public void setEndingValue(double endingValue) {
        this.endingValue = endingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    @Override
    double getTotalPrice() {
        return 0;
    }

    @Override
    double getMonthlyPayment() {
        return 0;
    }
}
