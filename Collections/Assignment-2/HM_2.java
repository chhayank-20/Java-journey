// 2. Write a Java program to count the number of key-value (size) mappings in a map.

import java.util.HashMap;

public class HM_2 {
    public static void main(String[] args) {
        HashMap<Integer,Object> h1 = new HashMap<>();
        h1.put(3,"three");
        h1.put(4,"four");
        h1.put(2,"two");
        h1.put(1,"one");
        System.out.println(h1);

        System.out.println(h1.size());
    }
}
