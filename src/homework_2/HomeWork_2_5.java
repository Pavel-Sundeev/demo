package homework_2;

import java.util.Scanner;

public class HomeWork_2_5 {
    static void main() {
        System.out.println("Введите любое целое положительное число");
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int result = 0;
        if (sc.hasNextInt()){
            num = sc.nextInt();
            if (num > 0){
                for (int i = 1; i <= num; i++) {
                    result += i;
                }
                System.out.println(result);
            } else {
                System.out.println("Число отрицательное");
            }

        } else {
            System.out.println("Некорректные данные");
        }
        sc.close();
    }
}
