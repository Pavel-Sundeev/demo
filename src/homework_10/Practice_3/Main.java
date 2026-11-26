package homework_10.Practice_3;

import java.util.HashSet;

public class Main {

    static void main(String[] args) {
        HashSet<Person> persons = new HashSet<>();
        Person p1 = new Person("Olga");
        Person p2 = new Person("Irina");
        Person p3 = new Person("Vera");

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        for (Person p: persons){
            System.out.println(p.toString());
        }

        persons.remove(p1);
        persons.remove(p2);

        System.out.println(persons.contains(p3));
    }
}
