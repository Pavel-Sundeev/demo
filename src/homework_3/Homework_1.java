package homework_3;

import java.util.Scanner;

public class Homework_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = sc.nextInt();
        if (size > 0){
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 10) + 1;
            }

            System.out.println("Вывод в прямом порядке: ");
            for (int a : arr){
                System.out.print(a + " ");
            }
            System.out.println();
            System.out.println("Вывод в обратном порядке: ");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Размерность массива не может быть меньше 0 или ей равной");
        }
        sc.close();

    }
}
