package Decorator.First.TEst;

public class QuotesDecorator extends Decorator{

    public QuotesDecorator(PrinterInterface component){
        super(component);
    }

    @Override
    public void print() {
        System.out.println("\"");
        super.print();
        System.out.println("\"");
    }
}
