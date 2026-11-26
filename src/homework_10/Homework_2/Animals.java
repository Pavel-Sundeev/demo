package homework_10.Homework_2;

import java.util.ArrayList;

public class Animals {

    private final ArrayList<String> listAnimals = new ArrayList<>();

    public void addAnimals(String animal) {
        //this.animals.addFirst(animals); - самый простой способ
        if (listAnimals.isEmpty()){
            listAnimals.add(animal);
            return;
        }

        listAnimals.add(0, animal);

    }

    public void deleteAnimals() {
//        if(this.animal.size() > 0){ - самый простой способ
//            this.animal.removeLast();
//        } else {
//            System.out.println("Список пустой!!! Нет животных, которых можно удалить.");
//        }
        if (listAnimals.isEmpty()){
            System.out.println("Список пустой!!! Нет животных, которых можно удалить.");
            return;
        }

        listAnimals.remove(listAnimals.size() - 1);

    }

    public void printInfoAnimals() {
        System.out.println(listAnimals);
    }
}
