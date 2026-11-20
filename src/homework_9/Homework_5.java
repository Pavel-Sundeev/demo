package homework_9;

import java.util.Scanner;

public class Homework_5 {

    public static String multiplySymbols(StringBuilder sb){
        for (int i = 0; i < sb.length(); i++) {
            sb.insert(i, sb.charAt(i));
            i += 1;
        }
        return sb.toString();
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(multiplySymbols(sb));
        sc.close();

    }
}
