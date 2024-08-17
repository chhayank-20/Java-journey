// 3. Write a Java program to get the number of elements in a hash set.

import java.util.HashSet;

public class H_3 {
    public static void  main(String args[]){
        HashSet<Object> h1= new HashSet<>();
        h1.add("one");
        h1.add(1293);
        h1.add("enum");
        h1.add(789);
        System.out.println(h1);
        System.out.println();
        System.out.println(h1.size());

    }
}
