package homework_10;

import java.util.*;

public class Homework_1 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputNumber = sc.nextLine();
        List<Integer> list = new ArrayList<>();
        for (String element : inputNumber.split(",")) {
            element = element.trim();
            if (element.isEmpty()) {
                continue;
            }

            int num = Integer.parseInt(element);
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        System.out.println(list);
        sc.close();
    }
}
