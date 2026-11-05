package homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = sc.nextInt();
        if (size > 0){
            int[] arr = new int[size];
            int indexMin = 0, indexMax = 0;
            System.out.println("Вводите элементы массива с клавиатуры: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]){
                    min = arr[i];
                    indexMin = i;
                }

                if (max < arr[i]){
                    max = arr[i];
                    indexMax = i;
                }
            }
            System.out.println("Индекс max -> " + indexMax + ", индекс min -> " + indexMin);
        } else {
            System.out.println("Размерность массива не может быть меньше 0 или ей равной");
        }
        sc.close();
    }
}
