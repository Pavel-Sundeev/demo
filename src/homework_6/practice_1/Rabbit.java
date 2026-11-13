package homework_6.practice_1;

public class Rabbit extends Animal{

    @Override
    public void voice() {
        System.out.println("Кролик тихо урчит");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("grass")){
            System.out.println("Кролик любит есть травку");
        } else {
            System.out.println("Кролик не доволен такой едой: " + food);
        }
    }
}
