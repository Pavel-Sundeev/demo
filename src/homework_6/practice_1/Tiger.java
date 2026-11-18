package homework_6.practice_1;

public class Tiger extends Animal{

    @Override
    public void voice() {
        System.out.println("Тигр рычит");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("meat")){
            System.out.println("Тигр любит есть мясо");
        } else {
            System.out.println("Тигр не доволен подобной едой: " + food);
        }
    }
}
