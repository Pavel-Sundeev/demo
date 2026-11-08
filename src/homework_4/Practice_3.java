package homework_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice_3 {
    static void main() {
        System.out.println("Введите размерность двуменрного массива: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк и столбцов: ");
        int a = sc.nextInt();
        int[][] arr = new int[a][a];
        int firstDiadonal = 1;
        int secondDiagonal = 1;
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(51);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j){
                    firstDiadonal *= arr[i][j];
                }
            }
        }
        System.out.println(firstDiadonal);
        for (int i = 0; i < arr.length; i++) {
            secondDiagonal *= arr[i][arr.length - 1 - i];
        }

        if (firstDiadonal > secondDiagonal) {
            System.out.println("Произведение элементов главной диагонали больше");
        } else if (secondDiagonal > firstDiadonal) {
            System.out.println("Произведение элементов побочной диагонали больше");
        } else {
            System.out.println("Произведения диагоналей равны");
        }
    }
}
