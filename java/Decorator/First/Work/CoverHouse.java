package Decorator.First.Work;

public abstract class CoverHouse implements HouseShell{

    protected HouseShell component;
    public CoverHouse(HouseShell component){
        this.component = component;
    }

    @Override
    public void wrapHouse(){
        component.wrapHouse();
    }

}
