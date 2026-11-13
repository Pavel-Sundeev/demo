package homework_5;

public class Calculator {
    double weight = 0;
    double cost = 0;
    String color = "white";

    {
        System.out.println("Создается объект калькулятора");  // данный блок инициализации используется для удобства, чтобы видеть когда и шде данный экземпляр класса создается
        System.out.println("-----------------------------");
    }

    public Calculator(double weight, double cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    public int add(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int division(int a, int b){
        return  b > 0 ? a / b : 0;
    }

    public int multiplication(int a, int b){
        return a * b;
    }

}
