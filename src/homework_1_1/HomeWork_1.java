package homework_1_1;

import java.util.*;

public class HomeWork_1 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Практика");
//        System.out.println("1 задание");
//        System.out.println("Павел Сундеев");
//
//        System.out.println("\n" + "2 задание");
//        int age = 24;
//        System.out.println("Павел Сундеев " + age);
//
//        System.out.println("\n" + "Домашнее задание");
//        System.out.println("1 задание");
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int a = 4 * (b + c - 1) / 2;
//        System.out.println(a);
//
//        System.out.println("\n" + "2 задание");
//        System.out.println("Введите двузначное число: ");
//        int n = sc.nextInt();
//        System.out.println("Сумма цифр числа равна: " + ((n % 10) + (n /10)));
//
//        System.out.println("\n" + "3 задание");
//        int w = sc.nextInt();
//        int third = w % 10;
//        int second = (w / 10) % 10;
//        int first = (w / 10) / 10;
//        int result = third + second + first;
//        System.out.println("Сумма цифр 3-х значного числа равна: " + result);

        System.out.println("\n" + "4 задание");
        double q = sc.nextDouble();
        q = Math.round(q);
        System.out.println(q);

        System.out.println("\n" + "5 задание");
        int f = sc.nextInt();
        int g = sc.nextInt();
        int resFirst = f / g;
        int resSecond = f % g;
        System.out.println(f + " / " + g + " = " + resFirst + " и " + resSecond + " в остатке");

        System.out.println("\n" + "Задача со звездочкой");
        int i = sc.nextInt(); // 1
        int j = sc.nextInt(); // 3
        int r = 0;
        r = i;
        i = j;
        j = r;
        System.out.println(i);
        System.out.println(j);

    }

}

