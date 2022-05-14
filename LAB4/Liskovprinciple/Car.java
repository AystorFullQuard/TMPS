package Liskovprinciple;

public class Car extends VehicleWithEngine {

    public int price = 2000;

    @Override
    public void setVehicleEngineType(String vehicleEngineType) {
        if (vehicleEngineType.equalsIgnoreCase("Petrol")) {
            this.price = this.price + 150;
        } else {
            this.price = this.price + 100;
        }
    }
}
