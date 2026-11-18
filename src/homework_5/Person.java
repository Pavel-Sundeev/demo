package homework_5;

public class Person {

    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public void talk(String text){
        System.out.println(fullName + " говорит " + text);
    }

    public void move(){
        System.out.println(fullName + " walk.");
    }
}
