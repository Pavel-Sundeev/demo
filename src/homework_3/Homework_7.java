package homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_7 {
    static void main() {
        System.out.println("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size > 0){
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int)(Math.random() * 10) + 1;
            }
            System.out.println(Arrays.toString(arr));

            if (arr[arr.length - 1] < 9){
                arr[arr.length - 1] += 1;
            } else {
                // случаи 2 и 3: идём влево через девятки
                int i = arr.length - 1;
                while (i >= 0 && arr[i] == 9) {
                    arr[i] = 0;
                    i--;
                }
                if (i >= 0) {
                    arr[i]++;              // нашли не-девятку
                } else {
                    int[] newArr = new int[arr.length + 1];  // все были 9
                    newArr[0] = 1;
                    arr = newArr;
                }
            }
        } else {
            System.out.println("Размерность массива не может быть отрицательной или равняться 0");
        }
        sc.close();
    }
}
