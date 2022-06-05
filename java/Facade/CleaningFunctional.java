package Facade;

public class CleaningFunctional {
    private Boolean isClean = false;
    void cleaning(Compartment compartment){
        if(Clean()){
            System.out.println("Уборка не требуется");
            setIsCleanTrue();
        } else {
            if(compartment.hasTrash()){
                System.out.println("идёт утилизация мусора из бака робота");
                System.out.println("идёт процесс уборки");
                int count = 0;
                while (count<100){
                    count+=20;
                    System.out.println("Прогресс: " + count + "%\n");
                }
                if(count >=99){
                    System.out.println("Сборка мусора и уборка завершена");
                    setIsCleanTrue();
                }
            }
            else{
                System.out.println("идёт процесс уборки");
                int count = 0;
                while (count<100){
                    count+=20;
                    System.out.println("Прогресс: " + count + "%\n");
                }
                if(count >=99){
                    System.out.println("Сборка мусора и уборка завершена");
                }
            }
        }
    }
    Boolean Clean(){
        return isClean;
    }
    void setIsCleanFalse(){
        isClean = false;
    }
    void setIsCleanTrue(){
        isClean=true;
    }
}
