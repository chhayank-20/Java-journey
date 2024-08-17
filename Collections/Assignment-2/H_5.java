// 5. Write a Java program to test if a hash set is empty or not.

import java.util.HashSet;
public class H_5 {
    public static void main(String[] args) {
        HashSet<Object> h1 = new HashSet<>();
        h1.add("trx");
        h1.add("one");
        h1.add(1293);
        h1.add("enum");
        h1.add(789);
        System.out.println(h1);
        System.out.println(h1.isEmpty());

        h1.removeAll(h1);
        System.out.println(h1);
        System.out.println(h1.isEmpty());

    }
}
