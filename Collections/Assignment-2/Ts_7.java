// 7.Write a Java program to add all the elements of a specified tree set to another tree set.

import java.util.TreeSet;
public class Ts_7 {
    public static void main(String[] args) {
        TreeSet<Object> ts1 = new TreeSet<>();
        ts1.add(2);
        ts1.add(3);
        ts1.add(5);
        ts1.add(12);
        System.out.println(ts1);

        //  TreeSet automaticaly sorts the value.
        //  No Duplicates are allowed . 
        TreeSet<Object> ts2 = new TreeSet<>();
        ts2.add(34);
        ts2.add(43);
        ts2.add(5);
        ts2.add(12);
        System.out.println(ts2);

        ts2.addAll(ts1);
        System.out.println(ts2);
    }
}
