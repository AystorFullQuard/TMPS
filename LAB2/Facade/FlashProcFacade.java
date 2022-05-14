package Facade;

public class FlashProcFacade {
    Power power = new Power();
    Memory mem = new Memory();
    HDD hdd = new HDD();

    void copy() {
        power.on();
        mem.load();
        hdd.copyFromStorageDevice(mem);
    }

    void load() {
        power.on();
        mem.load();
        hdd.loadFromStorageDevice(mem);
    }
}
