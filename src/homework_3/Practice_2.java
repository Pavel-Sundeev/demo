package homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_2 {
    static void main() {
        String[] fruits = new String[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = sc.nextLine();
        }
        System.out.println();

        System.out.println("Вывод в консоль 2 и 4 фрукта");
        for (int i = 1; i <= 3; i += 2) {
            System.out.println(fruits[i]);
        }
        System.out.println();

        System.out.println("Длина массива fruits равна: " + fruits.length + "\n");

        // Замена 3 фрукта на иной
        System.out.println("Введите новый фрукт на 3 позицию:");
        fruits[2] = sc.nextLine();

        for (String str : fruits){
            System.out.print(str + " ");
        }
        sc.close();



    }
}
