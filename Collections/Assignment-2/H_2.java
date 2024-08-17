// 2. Write a Java program to iterate through all elements in a hash list.

import java.util.HashSet;
import java.util.Iterator;

public class H_2 {
    public static void  main(String args[]){
        HashSet<Object> h1= new HashSet<>();
        h1.add("one");
        h1.add(1293);
        h1.add("enum");
        h1.add(789);
        System.out.println(h1);

        Iterator itr = h1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
