package homework_6.practice_2;

public class Director implements Position{

    String pos = "Директор";

    @Override
    public void printPosition() {
        System.out.println("Занимает должность: " + pos);
    }
}
