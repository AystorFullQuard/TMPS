package Adapter;

/*
Адаптер
Цель:
Преобразование интерфейса одного касса в интерфейс того класса, который необходим клиенту.

Использование:
ДЛя обеспечения совместной работы классов, интерфейсы которых не совместимы

Пример использования:
-интерфейса класса, который мы хотим использовать не соответствует нашим потребностям;
- необходим класс, которых должен взаимодействовать с классами, 
которые ему неизвестны или не связаны с ним
*/
public class MainAdapter {
    public static void main(String[] args) {
        AmericanSocket socket = new SimpleAmericanSocket();
        Radio radio = new Radio();

        EuroSocket euroSocket = new SocketAdapter(socket);
        radio.listenMusic(euroSocket);

    }
}