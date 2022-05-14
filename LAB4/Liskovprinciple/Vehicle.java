package Liskovprinciple;

/**
 * Подклассы должны дополнять, а не замещать
 * поведение базового класса.
 */
public class Vehicle {
    private String vehicleName;
    private double vehicleSpeed;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public double getVehicleSpeed() {
        return vehicleSpeed;
    }

    public void setVehicleSpeed(double vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

}
