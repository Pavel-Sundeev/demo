package homework_4;

import java.util.Random;
import java.util.Scanner;

public class Practice_2 {
    static void main() {
        System.out.println("Введите размерность двумерного массива: ");
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int[][] arr = new int[a][a];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(51);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i != j){
                    if(arr[i][j] % 2 != 0){
                        System.out.println(arr[i][j]);
                    }
                } else {
                    break;
                }
            }
        }
        sc.close();
    }
}
