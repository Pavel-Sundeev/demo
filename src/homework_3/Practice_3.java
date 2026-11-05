package homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size > 0){
            double[] masDouble = new double[size];
            for (int i = 0; i < masDouble.length; i++) {
                masDouble[i] = (int) (Math.random() * 10) + 1;
            }

            System.out.println("После заполнения массива рандомными числами, его наполнили следующие значения: ");
            for (double num : masDouble){
                System.out.println(num);
            }
            System.out.println();

            //Возведение каждого четного числа в массиве в квадрат
            for (int i = 0; i < masDouble.length; i++) {
                if (masDouble[i] % 2 == 0){
                    masDouble[i] = masDouble[i] * masDouble[i];
                }
            }
            System.out.println();

            System.out.println("Вывод массива в прямом порядке");
            for (double num : masDouble){
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println("Вывод массива в обратном порядке");
            for (int i = masDouble.length - 1; i >= 0 ; i--) {
                System.out.print(masDouble[i] + " ");
            }
        } else {
            System.out.println("Введенное число не может быть отрицательным или равным 0");
        }
        sc.close();

    }
}
