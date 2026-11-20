package homework_9;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_2 {

    public static void sort(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length() > arr[j + 1].length()){
                    String temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        sort(arr);

        for (String s : arr){
            System.out.println(s);
        }
        sc.close();

    }
}
