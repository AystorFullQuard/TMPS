package Bridge.second;

/*Мост
Цель 
Отделить абстракцию от ее реализаци таким образом, 
    чтобы мы могли изменять независимо друг от друга и то и другое
Использование:
Для получения преимуществ наследования без потери гибкости

Пример:
- для разделения одной реализации между несколькими объектами и не показывать это клиенту
                            --Shape--
                           /          \
                    Reactangle        Circle
                   /          \      /      \
             BlueRact     RedRect   BlueCr  RedCr
Change to:
                      --Shape--                     Color
                     /          \                   /     \
             Reactangle(Color)  Circle(Color)     Blue   Red
*/
public class ProgApp {
    public static void main(String[] args) {
        Weapon wp1 = new Rifle(new Mosin());
        wp1.shoot();
        Weapon wp2 = new Pistol(new Makarov());
        wp2.shoot();
    }
}
