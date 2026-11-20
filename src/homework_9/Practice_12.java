package homework_9;

public class Practice_12 {
    static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hello");
        builder.append("xxx");
        System.out.println(builder);

        builder.insert(4, 'y');
        System.out.println(builder);

        builder.delete(3, 6);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        String string = builder.toString();
        System.out.println(string);
    }
}
