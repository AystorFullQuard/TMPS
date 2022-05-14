package Visitor;

public class GoodWorker implements Visitor {
    public void visit(CompCase copmCase) {
        System.out.println("Cleaned the Computer Case");
    }

    public void visit(Processor proc) {
        System.out.println("Replaced the thermal paste");
    }

    public void visit(PowerSuply powerSuply) {
        System.out.println("Soldered some wires in the Power Suply");
    }

    public void visit(CompComponent compComponent) {
        System.out.println("Examined the state of computer");
    }
}
