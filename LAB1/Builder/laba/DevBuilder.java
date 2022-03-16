package laba;
/*Абстрактный билдер разработчик*/

public abstract class DevBuilder {
    Developer dev; /* Хранит в себе разработчика */
    // метод, создающий разработчика

    public void createDev() {
        dev = new Developer();
    }

    // Абстрактные методы, которые "создают" разработчика
    abstract void buildDevType();

    abstract void buildDevWork();

    abstract void buildSalary();

    // Метод, возращающий разоработчика
    Developer getDev() {
        return dev;
    }
}
