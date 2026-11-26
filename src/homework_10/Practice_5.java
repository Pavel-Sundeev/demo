package homework_10;

import java.util.Collection;
import java.util.HashMap;

public class Practice_5 {

    static void main(String[] args) {
        HashMap<String, Integer> card = new HashMap<>();
        card.put("1234 5678 9101 1121", 5000);
        card.put("1234 5678 9101 2221", 6000);
        card.put("1234 5678 9101 3321", 7000);
        System.out.println(card);

        card.remove("1234 5678 9101 1121");
        card.remove("1234 5678 9101 3321");
        System.out.println(card);

        System.out.println(card.get("1234 5678 9101 2221"));

        Collection<String> key = card.keySet();
        for (String k : key){
            System.out.println(k);
        }

        Collection<Integer> val = card.values();
        int result = 0;
        for (int a : val){
            result += a;
        }
        System.out.println(result);

        System.out.println(card.containsKey("1234 5678 9101 2221"));
        System.out.println(card.containsValue(9000));
    }
}
