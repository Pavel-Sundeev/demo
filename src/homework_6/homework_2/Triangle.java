package homework_6.homework_2;

public class Triangle extends Figure{

    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    void square() {
        System.out.println("Площадь прямоугольника равна: " + (a * b));
    }

    @Override
    void perimetr() {
        System.out.println("Периметр треугольника равен: " + (2*a + 2*b));
    }
}
