package homework_6.homework_2;

public class Rectangle extends Figure{

    private double a;
    private double h;

    public Rectangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    void square() {
        System.out.println("Площадь круга треугольника равна: " + (0.5 * (a * h)));
    }

    @Override
    void perimetr() {
        System.out.println("Периметр треугольника равен: " + (a*3));
    }
}
