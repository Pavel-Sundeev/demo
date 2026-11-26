package homework_10.Homework_2;

import java.util.ArrayList;

public class Main {

    static void main(String[] args) {
        Animals animals = new Animals();
        animals.addAnimals("Cat");
        animals.addAnimals("Dog");
        animals.addAnimals("Snake");
        animals.addAnimals("Bird");
        animals.printInfoAnimals();
        animals.deleteAnimals();
        animals.printInfoAnimals();

    }
}
