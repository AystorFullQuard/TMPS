package Liskovprinciple;

public class VehicleWithEngine extends Vehicle {
    private String vehicleEngineType;

    public String getVehicleEngineType() {
        return vehicleEngineType;
    }

    public void setVehicleEngineType(String vehicleEngineType) {
        this.vehicleEngineType = vehicleEngineType;
    }

}
