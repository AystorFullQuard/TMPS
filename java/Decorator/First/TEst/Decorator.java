package Decorator.First.TEst;

public abstract class Decorator implements PrinterInterface{
    protected PrinterInterface component;
    public Decorator(PrinterInterface component) {this.component = component;}

    @Override
    public void print(){
        component.print();
    }
}
