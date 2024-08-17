// 1. Write a Java program to associate the specified value with the specified key in a HashMap.

import java.util.HashMap;
public class HM_1 {
    public static void main(String[] args) {
        HashMap<Integer,Object> h1 = new HashMap<>();
        h1.put(3,"three");
        h1.put(4,"four");
        h1.put(2,"two");
        h1.put(1,"one");
        System.out.println(h1);
        
        
    }
}
