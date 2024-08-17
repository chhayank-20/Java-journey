// 4. Write a Java program to search for a value in a Tree Map.

import java.util.TreeMap;
public class TM_4 {
    public static void main(String[] args) {
        TreeMap<Object,Object> t1 = new TreeMap<>();
        t1.put(4,"four");
        t1.put(6,"six");
        t1.put(8,"eight");
        t1.put(2,"two");
        t1.put(10,"ten"); 
        System.out.println(t1);

        // System.out.println(t1.get(2));
        // System.out.println(t1.get(4));

//  returns boolean value 
        System.out.println(t1.containsValue("args"));
        System.out.println(t1.containsValue("two"));
        System.out.println(t1.containsKey(4));
        System.out.println(t1.containsKey(5));
    }
}
