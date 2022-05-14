package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Soldier {

    private List<Soldier> components = new ArrayList<>();

    public void addComponent(Soldier component) {
        components.add(component);
    }

    public void removeComponent(Soldier component) {
        components.remove(component);
    }

    @Override
    public void Order() {
        for (Soldier component : components) {
            component.Order();
        }
    }

}
