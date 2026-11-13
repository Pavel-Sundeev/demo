package homework_6.homework_2;

public class Circle extends Figure{

    private static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void square() {
        System.out.println("Площадь круга равна: " + PI * radius * radius);
    }

    @Override
    void perimetr() {
        System.out.println("Периметр круга равен: " + PI * radius * 2);
    }
}
