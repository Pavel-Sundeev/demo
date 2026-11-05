package homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = sc.nextInt();
        if (size > 0){
            int[] arr = new int[size];
            System.out.println("Вводите элементы массива с клавиатуры: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int min = arr[0], max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (min > arr[i]){
                    min = arr[i];
                }

                if (max < arr[i]){
                    max = arr[i];
                }
            }

            System.out.println("Максимальный и минимальный элементы массива: " + "min = " + min + ", max = " + max);
        } else {
            System.out.println("Размерность массива не может быть меньше 0 или ей равной");
        }
        sc.close();

    }
}
