package homework_9;

import java.util.Scanner;

public class Homework_3 {

    public static void printMinAvgLengthString(String[] arr, int res){
        double avg = (double) res / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < avg){
                System.out.println(arr[i] + ": " + arr[i].length());
            }
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        int resultLength = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
            resultLength += arr[i].length();
        }
        printMinAvgLengthString(arr, resultLength);
        sc.close();
    }
}
