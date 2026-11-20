package homework_9;

import java.util.Scanner;

public class Homework_4 {

    public static String notIdenticalString(String[] arr){
        String word = null;
        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            boolean isRepeat = false;
            for (int j = 0; j < chars.length; j++) {
                int index = arr[i].lastIndexOf(chars[j]);
                if (index != j){
                    isRepeat = true;
                    break;
                }
            }

            if (!isRepeat){
                word = arr[i];
                break;
            }
        }
        return word;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isIdenticalStrings = false;
        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println(notIdenticalString(arr));
        sc.close();

    }
}
