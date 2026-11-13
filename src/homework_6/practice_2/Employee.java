package homework_6.practice_2;

public class Employee implements Position{

    String pos;

    @Override
    public void printPosition() {
        System.out.println("Занимает должность: " + pos);
    }
}
