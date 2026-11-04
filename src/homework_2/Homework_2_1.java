package homework_2;

import java.util.Scanner;

public class Homework_2_1 {
    static void main() {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}
