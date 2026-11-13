package homework_5;

public class Main {
    static void main(String[] args) {
        Calculator calc = new Calculator(45, 150, "Red");
        System.out.println("-----------------------");
        System.out.println("Сложение: " + calc.add(5, 2));
        System.out.println("Вычетание: " + calc.sub(5, 1));
        System.out.println("Деление на 0: " + calc.division(5, 0));
        System.out.println("Длеение не на 0: " + calc.division(10, 2));
        System.out.println("Умножение: " + calc.multiplication(5, 2));

        System.out.println("------------------------");
        System.out.println(calc.weight);
        System.out.println(calc.color);


        System.out.println("----------------------------------------------------");
        Person person1 = new Person();
        Person person2 = new Person("Павел Сундеев", 25);

        person1.talk("говорю что у меня нет имени");
        person1.move();

        person2.talk("что то говорю");
        person2.move();
    }
}
