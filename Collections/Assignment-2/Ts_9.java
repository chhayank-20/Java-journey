// 9.Write a Java program to get the first and last elements in a tree set.

import java.util.TreeSet;
public class Ts_9 {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 =new TreeSet<>();
        ts1.add(2);
        ts1.add(3);
        ts1.add(5);
        ts1.add(12);
        System.out.println(ts1);

        System.out.println(ts1.size());
        
        System.out.println(ts1.first());
        System.out.println(ts1.last());

    }
}
