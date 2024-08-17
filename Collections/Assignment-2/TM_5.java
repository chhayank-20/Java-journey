// 5. Write a Java program to get all keys from a Tree Map.

import java.util.TreeMap;
public class TM_5 {
    public static void main(String[] args) {
        TreeMap<Object,Object> t1 = new TreeMap<>();
        t1.put(4,"four");
        t1.put(6,"six");
        t1.put(8,"eight");
        t1.put(2,"two");
        t1.put(10,"ten"); 
        System.out.println(t1);

//  to get All keys
        System.out.println(t1.keySet());
//  to get All values
        System.out.println(t1.values());

    }
}
