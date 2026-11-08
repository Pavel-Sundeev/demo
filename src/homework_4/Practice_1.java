package homework_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice_1 {
    static void main() {
        System.out.println("Введите размерность двуменрного массива: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк и столбцов: ");
        int a = sc.nextInt();
        int[][] arr = new int[a][a];
        int sum = 0;
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(51);
            }
        }
        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j){
                    if (arr[i][j] % 2 == 0){
                        sum += arr[i][j];
                    }
                }
            }
        }
        System.out.println("Сумма четных элементов на главной диагонали: " + sum);
    }
}
