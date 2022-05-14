package Visitor;

public class CompCase implements Components {
    // Корпус компьютера
    public void accept(Visitor vis) {
        vis.visit(this);
    }
}
