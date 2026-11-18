package homework_6.practice_1;

public class Main {

    static void main(String[] args) {
        Rabbit r = new Rabbit();
        r.voice();
        r.eat("grass");
        r.eat("meat");
        System.out.println();
        Dog d = new Dog();
        d.voice();
        d.eat("meat");
        d.eat("grass");
        System.out.println();
        Tiger t = new Tiger();
        t.voice();
        t.eat("meat");
        t.eat("grass");
    }
}
