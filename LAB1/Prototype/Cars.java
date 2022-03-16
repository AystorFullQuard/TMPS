public class Cars {
    private int CarId;
    private String CarName;

    public int getCarId() {
        return CarId;
    }

    public void setCarId(int carId) {
        CarId = carId;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    @Override
    public String toString() {
        return "Cars [CarId=" + CarId + ", CarName=" + CarName + "]";
    }

}
