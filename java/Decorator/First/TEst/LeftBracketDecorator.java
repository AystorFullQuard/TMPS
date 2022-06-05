package Decorator.First.TEst;

public class LeftBracketDecorator extends Decorator{
    public LeftBracketDecorator(PrinterInterface component){
        super(component);
    }

    @Override
    public void print() {
        System.out.println("[");
        super.print();
    }
}
