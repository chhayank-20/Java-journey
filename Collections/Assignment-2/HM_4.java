// 4. Write a Java program to remove all mappings from a map.

import java.util.HashMap;
public class HM_4 {
    public static void main (String args[]){
        HashMap<Object,Object> h1 = new HashMap<>();
        h1.put(1,"orange");
        h1.put("zero","apple");
        h1.put(3,"grapes");
        h1.put("four","melon");
        h1.put(null,"mango");
        System.out.println(h1);

        h1.clear();
        System.out.println(h1);
    }
}
