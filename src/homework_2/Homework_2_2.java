package homework_2;

import java.util.Scanner;

public class Homework_2_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp > -5){
            System.out.println("Warm");
        } else if (temp <= -5 && temp > -20) {
            System.out.println("Normal");
        } else if (temp <= -20) {
            System.out.println("Cold");
        }
    }
}
