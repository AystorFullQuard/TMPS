package Composite;

/*
Компоновщик
Цель:
Скомпонировать объекты в структуры по типу "дерева", позволяя клиентам
    единообразно трактовать отдельные и составные объекты.

Использование:
Для группировки мелких компонентов в более крупные, которые
    могут стать основой для еще более крупных структур

Пример:
- для представления иерархии "часть-целое"
- мы хотим, чтобы клиенты одним способом трактовали как отдельные, так и составные объекты.
*/
public class CompApp {
    public static void main(String[] args) {
        Soldier corporal1_1 = new Corporal();
        Soldier corporal1_2 = new Corporal();
        Soldier corporal2_1 = new Corporal();
        Soldier corporal2_2 = new Corporal();
        Soldier corporal3_1 = new Corporal();
        Soldier corporal3_2 = new Corporal();
        Soldier corporal4_1 = new Corporal();
        Soldier corporal4_2 = new Corporal();

        Soldier sergeant1_1 = new Sergeant();
        Soldier sergeant2_1 = new Sergeant();
        Soldier sergeant3_2 = new Sergeant();
        Soldier sergeant4_2 = new Sergeant();

        Soldier lieutenant1_1 = new Lieutenant();
        Soldier lieutenant2_1 = new Lieutenant();

        Soldier captain1 = new Captain();

        // капралы
        Composite compCPR_1 = new Composite();
        Composite compCPR_SER_1 = new Composite();

        Composite compCPR_2 = new Composite();
        Composite compCPR_SER_2 = new Composite();

        Composite compCPR_3 = new Composite();
        Composite compCPR_SER_3 = new Composite();

        Composite compCPR_4 = new Composite();
        Composite compCPR_SER_4 = new Composite();
        // сержанты
        Composite compSER_1 = new Composite();
        Composite compSER_LIE_1 = new Composite();

        Composite compSER_2 = new Composite();
        Composite compSER_LIE_2 = new Composite();
        // лейтенанты
        Composite compLIE_1 = new Composite();
        Composite compCAP = new Composite();

        // капралы
        compCPR_1.addComponent(corporal1_1);
        compCPR_1.addComponent(corporal1_2);

        compCPR_SER_1.addComponent(sergeant1_1);
        compCPR_SER_1.addComponent(compCPR_1);

        compCPR_2.addComponent(corporal2_1);
        compCPR_2.addComponent(corporal2_2);

        compCPR_SER_2.addComponent(sergeant2_1);
        compCPR_SER_2.addComponent(compCPR_2);

        compCPR_3.addComponent(corporal3_1);
        compCPR_3.addComponent(corporal3_2);

        compCPR_SER_3.addComponent(sergeant3_2);
        compCPR_SER_3.addComponent(compCPR_3);

        compCPR_4.addComponent(corporal4_1);
        compCPR_4.addComponent(corporal4_2);

        compCPR_SER_4.addComponent(sergeant4_2);
        compCPR_SER_4.addComponent(compCPR_4);

        // сержанты
        compSER_1.addComponent(sergeant1_1);
        compSER_1.addComponent(sergeant2_1);

        compSER_LIE_1.addComponent(lieutenant1_1);
        compSER_LIE_1.addComponent(compSER_1);

        compSER_2.addComponent(sergeant3_2);
        compSER_2.addComponent(sergeant4_2);

        compSER_LIE_2.addComponent(lieutenant2_1);
        compSER_LIE_2.addComponent(compSER_2);

        // лейтенанты
        compLIE_1.addComponent(lieutenant1_1);
        compLIE_1.addComponent(lieutenant2_1);

        compCAP.addComponent(compLIE_1);
        compCAP.addComponent(captain1);

        compCAP.Order();
        System.out.println();
        compSER_LIE_1.Order();
        System.out.println();
        compCPR_SER_1.Order();

    }
}
