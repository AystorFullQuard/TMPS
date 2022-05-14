package State;

/**
 * Состояние
 * цель использования
 * Управление поведения объекта в зависимотси от состояния.
 * 
 * пример:
 * - поведение объекта зависит от его состояния и изменяется во время выполнения
 */

public class Program {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setAmmoAmount(30);

        weapon.setState(new AutomaticShot());
        for (int i = 0; i < 30; i++) {
            weapon.shoot();
        }
    }
}
