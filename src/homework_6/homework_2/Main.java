package homework_6.homework_2;

public class Main {

    static void main(String[] args) {
        Circle c = new Circle(2);
        Triangle t = new Triangle(2.5, 5);
        Rectangle r = new Rectangle(5, 4);

        Figure[] arr = new Figure[3];
        arr[0] = c;
        arr[1] = t;
        arr[2] = r;

        for (int i = 0; i < arr.length; i++) {
            arr[i].square();
            arr[i].perimetr();
        }
    }
}
