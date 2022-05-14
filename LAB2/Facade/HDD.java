package Facade;

public class HDD {
    void copyFromStorageDevice(Memory mem) {
        if (mem.hasData()) {
            System.out.println("Data is copied.");
        } else {
            System.out.println("Please, load some data.");
        }
    }

    void loadFromStorageDevice(Memory mem) {
        if (mem.hasData()) {
            System.out.println("Data is loaded.");
        } else {
            System.out.println("Please, load some data.");
        }
    }
}
