package homework_6.practice_1;

public class Dog extends Animal{

    @Override
    public void voice() {
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("meat")){
            System.out.println("Собака любит есть мясо");
        } else {
            System.out.println("Собака не довольна такой едой: " + food);
        }
    }
}
