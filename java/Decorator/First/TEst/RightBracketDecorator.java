package Decorator.First.TEst;

public class RightBracketDecorator extends Decorator{

    public RightBracketDecorator(PrinterInterface component){
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("]");
    }
}
