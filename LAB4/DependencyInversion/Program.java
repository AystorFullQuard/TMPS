package DependencyInversion;

/**
 * Модули высокого уровня не должны зависеть от модулей низкого уровня. Оба
 * должны зависеть от абстракции
 * Абстракции не должны зависеть от деталей, детали должны зависеть от
 * абстракций.
 */
public class Program {
    public static void main(String[] args) {
        MessengerClient API = new MessengerClient(new TelegramMessenger());
        API.UseMessenger();
    }
}
