package homework_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework_3 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = sc.nextInt();
        System.out.println("Заполните массив строк: ");
        String[] mass = new String[size];
        sc.nextLine();
        for (int i = 0; i < size; i++) {
            mass[i] = sc.nextLine();
        }

        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < mass.length; i++) {
            if(!map.containsKey(mass[i])){
                map.put(mass[i], false);
            }else {
                map.put(mass[i], true);
            }
        }

        System.out.println(map);
        sc.close();
    }
}
