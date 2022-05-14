package Liskovprinciple.Dontwork;

public class Car extends Vehicle {
    public int price = 2000;

    @Override
    public void setVehicleEngineType(String vehicleEngineType) {
        if (vehicleEngineType.equalsIgnoreCase("Petrol")) {
            this.price = this.price + 500;
        } else {
            this.price = this.price + 1000;
        }
    }
}
