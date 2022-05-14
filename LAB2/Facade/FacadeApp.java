package Facade;

/*
Фасад
Цель:
предоставить унифицированный интерфейс вместо нескольких интерфейсов подсистемы.

Использование:
Используется для определения интерфейса высокого уровня, который упрощает использоваиня подсистемы.

Пример использования:
- изолирование клиентов от компонентов подсистемы, упрощая работу с ней
- необходимость ослабления связанности подсистемы с клиентами
*/
public class FacadeApp {
    public static void main(String[] args) {
        // Power power = new Power();
        // power.on();
        // Memory mem = new Memory();
        // mem.load();
        // HDD hdd = new HDD();
        // hdd.loadFromStorageDevice(mem);
        // hdd.copyFromStorageDevice(mem);
        FlashProcFacade flash = new FlashProcFacade();
        flash.copy();
        flash.load();
    }
}
