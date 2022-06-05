package Decorator.First.Work;

public class Rainfall extends CoverHouse{
    public Rainfall(HouseShell component) {
        super(component);
    }

    @Override
    public void wrapHouse(){
        System.out.println("Дом защищён от сильных осадков");
        super.wrapHouse();
        System.out.println("Дом защищён от сильных осадков");
    }
}
