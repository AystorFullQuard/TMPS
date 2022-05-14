package Visitor;

public class BadWorker implements Visitor {
    public void visit(CompCase copmCase) {
        System.out.println("Knocked the Computer Case");
    }

    public void visit(Processor proc) {
        System.out.println("Did not replace the thermal paste");
    }

    public void visit(PowerSuply powerSuply) {
        System.out.println("Broke some stuff in the Power Suply");
    }

    public void visit(CompComponent compComponent) {
        System.out.println("Dropped the computer on the floor");
    }
}
