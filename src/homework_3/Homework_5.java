package homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_5 {
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
            int num;
            for (int i = 0; i < arr.length / 2; i++) {
                num = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = num;
            }
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Размерность массива не может быть отрицательной или равняться 0");
        }
        sc.close();
    }
}
