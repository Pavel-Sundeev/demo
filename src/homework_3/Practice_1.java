package homework_3;

import java.util.Random;

public class Practice_1 {
    static void main() {
        Random rand = new Random();
        int a = 0;
        for (int i = 0; i < 5; i++) {
            a = rand.nextInt(100) + 1;
            System.out.println(a);
            a = (int) Math.pow(a, 2); // либо можно немного по другому a = a * a;
            System.out.println(a);
            System.out.println();
        }

    }
}
