// 6 Write a Java program to iterate through all elements in a tree set.

import java.util.Iterator;
import java.util.TreeSet;
public class Ts_6 {
    public static void main(String args[]){
        TreeSet<Object> h1= new TreeSet<>();
        //  TreeSet takes only homogeneous( Similar type ) data . 

        // h1.add("enum");
        h1.add(789);
        // h1.add("trx");
        h1.add(1293);
        // h1.add("one");
        h1.add(289);
        h1.add(492);
        System.out.println(h1);

        Iterator itr = h1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }
}
