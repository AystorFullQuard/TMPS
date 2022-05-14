package Visitor;

public class PowerSuply implements Components {
    public void accept(Visitor vis) {
        vis.visit(this);
    }
}
