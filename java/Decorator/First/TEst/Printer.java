package Decorator.First.TEst;

public class Printer implements PrinterInterface{
    String value;

    public Printer(String value){
        this.value = value;
    }
    @Override
    public void print() {
        System.out.println(value);
    }
}
