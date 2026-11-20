package homework_9;

import java.util.Scanner;

public class Homework_1 {

    public static int maxLength(String[] arr){
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j].length() < arr[i].length()){
                j = i;
            }
        }
        return j;
    }

    public static int minLength(String[] arr){
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j].length() > arr[i].length()){
                j = i;
            }
        }
        return j;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        int max = maxLength(arr);
        int min = minLength(arr);

        System.out.println("Cамая короткая строка: " + arr[min] + ", ее длина равна: " + arr[min].length());
        System.out.println("Cамая длиная строка: " + arr[max] + ", ее длина равна: " + arr[max].length());
        sc.close();
    }
}
