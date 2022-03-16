import java.util.ArrayList;
import java.util.List;

public class CarShop implements Copyable {
    private String ShopName;
    List<Cars> cars = new ArrayList<>();

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public List<Cars> getCars() {
        return cars;
    }

    public void setCars(List<Cars> cars) {
        this.cars = cars;
    }

    public void LoadData() {
        for (int i = 1; i <= 5; i++) {
            Cars c = new Cars();
            c.setCarId(i);
            c.setCarName("Car " + i);
            getCars().add(c);
        }
    }

    @Override
    public String toString() {
        return "CarShop [ShopName=" + ShopName + ", cars=" + cars + "]";
    }

    @Override
    public Object ShallowCopy() {
        CarShop copy = new CarShop();
        /*  */
        return copy;
    }

    @Override
    public CarShop DeepCopy() {
        CarShop cs = new CarShop();

        for (Cars c : this.getCars()) {
            cs.getCars().add(c);
        }

        return cs;
    }

}
