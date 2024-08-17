// 1. Write a Java program to associate the specified value with the specified key in a Tree Map.

import java.util.TreeMap;
public class TM_1 {
    public static void main(String[] args) {
        TreeMap<Object,Object> t1 = new TreeMap<>();
// no null value can be given in key 
// if duplicate value is given , it will overwrite the value 
        t1.put(4,"four");
        t1.put(5,"five");
        t1.put(8,"eight");
        // t1.put(null,"no value");
        t1.put(4,"new value"); 
        System.out.println(t1);
    }
}
