package homework_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework_1 {

    public static void inputNumber(){
        Scanner sc = new Scanner(System.in);
        int num;
        try{
            System.out.println("Введите число: ");
            num = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Исключение: " + e);
        } finally {
            sc.close();
        }
    }

    public static void devidedByZero(int a){
        try {
            int b = 0;
            int result = a / b;
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль запрещено!!!!");
        }
    }

    public static void method(){
        int[] arr = new int[2];
        int a=5, b=0;
        try {
            int c = arr[5];
            int result = a / b;
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль запрещено");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Массив размерностью: " + arr.length + ". Проверьте правильность обращения к элементу");
        }
    }

    public static void methodTwo(){
        int[] arr = new int[2];
        int a=5, b=0;
        try {
            int c = arr[5];
            int result = a / b;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Проверьте одну из нескольких операций");
        }
    }

    static void main(String[] args) {
        inputNumber();
        System.out.println("----------------");
        devidedByZero(5);
        System.out.println("----------------");
        method();
        System.out.println("----------------");
        methodTwo();
    }
}
