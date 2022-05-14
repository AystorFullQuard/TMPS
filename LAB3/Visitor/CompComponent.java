package Visitor;

public class CompComponent implements Components {
    // Компьютер
    Components[] components;

    public CompComponent() {
        this.components = new Components[] {
                new CompCase(), new PowerSuply(), new Processor()
        };
    }

    public void accept(Visitor vis) {
        for (Components comp : components) {
            comp.accept(vis);
        }
        vis.visit(this);
    }
}
