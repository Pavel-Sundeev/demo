package homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_4 {
    static void main() {
        System.out.println("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size > 0){
            int[] arr = new int[size];
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int)(Math.random() * 10);
                if (arr[i] == 0){
                    count++;
                }
            }
            System.out.println(Arrays.toString(arr));
            if (count > 0){
                System.out.println("В массиве содержится " + count + " нулевых элементов");
            } else {
                System.out.println("В массиве нет нулевых элементов");
            }

        } else {
            System.out.println("Размерность массива не может быть отрицательной или равняться 0");
        }
        sc.close();
    }
}
