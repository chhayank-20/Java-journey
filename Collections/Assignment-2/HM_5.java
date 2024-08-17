// 5. Write a Java program to check whether a map contains key-value mappings (empty) or not.

import java.util.HashMap;
public class HM_5 {
    public static void main(String[] args) {
        HashMap<Object,Object> h1 = new HashMap<>();
        h1.put(1,"orange");
        h1.put(2,"apple");
        h1.put(3,"grapes");
        h1.put(4,"melon");
        h1.put(null,"guava");
//  only one null value is allowed , if assigned again it will overwrite the value .
        h1.put(null,"guava 123");
        System.out.println(h1);

        System.out.println(h1.get(3));
        System.out.println(h1.get(6));
//  if it has key , it will return its value , otherwise returns null .
        System.out.println(h1.get("apple"));
        System.out.println(h1.get("mango"));
    }
}
