package Facade;

public class Compartment {

    private Boolean trash = false;

    boolean hasTrash(){
        return trash;
    }

    void collectTrash(){
        trash = true;
    }

    void disposeTrash(){
        trash = false;
    }

}
