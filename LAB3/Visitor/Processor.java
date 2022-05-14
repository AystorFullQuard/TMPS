package Visitor;

public class Processor implements Components {
    public void accept(Visitor vis) {
        vis.visit(this);
    }
}
