package homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_6 {
    static void main() {
        System.out.println("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size > 0){
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int)(Math.random() * 10);
            }
            System.out.println(Arrays.toString(arr));

            int first = arr[0];
            boolean isTrue = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > first){
                    first = arr[i];
                } else {
                    isTrue = true;
                    break;
                }
            }

            if (!isTrue){
                System.out.println("Массив является возрастающей последовательностью");
            } else {
                System.out.println("Массив не является возрастающей последовательностью");
            }

        } else {
            System.out.println("Размерность массива не может быть отрицательной или равняться 0");
        }
        sc.close();
    }
}
