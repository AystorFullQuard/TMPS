package Decorator.First.Work;

public class Wrap implements HouseShell{

    protected String cover;

    public Wrap(String cover){
        this.cover = cover;
    }

    @Override
    public void wrapHouse() {
        System.out.println(cover);
    }
}
