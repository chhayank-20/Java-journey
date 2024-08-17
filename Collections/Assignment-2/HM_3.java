// 3. Write a Java program to copy all mappings from the specified map to another map.

import java.util.HashMap;

public class HM_3 {
    public static void main(String[] args) {
         HashMap<Integer,Object> h1 = new HashMap<>();
         h1.put(2,"two");
         h1.put(1,"one");
         h1.put(3,"three");
         h1.put(4,"four");
        
        System.out.println(h1);

        HashMap<Integer,Object> h2 = new HashMap<>();
    //  by this the further changes are not reflected in orignal hashmap
        h2.putAll(h1);
        System.out.println("\nh2 : ");
        System.out.println(h2);

    //  by clone method , the changes made in orignal hashmap is reflected in the clone one
        @SuppressWarnings("unchecked")
        HashMap<Integer,Object> h3 = (HashMap<Integer,Object>)h1.clone();
        
        System.out.println("\nh3 : ");
        System.out.println(h3);

    }
}
