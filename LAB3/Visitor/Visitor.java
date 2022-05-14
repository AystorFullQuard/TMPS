package Visitor;

public interface Visitor {
    // Посетитель
    void visit(PowerSuply powerSuply);

    void visit(CompCase copmCase);

    void visit(CompComponent compElement);

    void visit(Processor proc);
}
