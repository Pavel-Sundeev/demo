package homework_10;

import java.util.ArrayList;

public class Practice_1 {

    static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>();
        country.add("Russia");
        country.add("Germany");
        country.add("USA");
        System.out.println(country);

        country.set(1, "Australia");
        System.out.println(country);

        country.remove(1);
        System.out.println(country);

        country.remove("USA");
        System.out.println(country);

        int index = country.indexOf("Russia");
        System.out.println(index);

        System.out.println(country.contains("Russia"));

    }
}
