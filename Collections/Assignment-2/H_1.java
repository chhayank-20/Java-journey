// 1.Write a Java program to append the specified element to the end of a hash set.

import java.util.HashSet;
public class H_1 {
    public static void main(String[] args) {
        HashSet<Object> h1 = new HashSet<>();
        h1.add("one");
        h1.add("two");
        h1.add("three");
        h1.add("four");
        h1.add("five");
        h1.add("six");

        //  order cannot be predicted .

        System.out.println(h1);
    }
}
