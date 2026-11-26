package homework_10;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Practice_2 {

    static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("Poland");
        ll.addFirst("Belarus");
        ll.addLast("Russia");
        ll.addLast("USA");
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

    }
}
