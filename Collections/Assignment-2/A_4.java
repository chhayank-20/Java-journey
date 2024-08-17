// 4. Write a Java program to iterate a linked list in reverse order.

import java.util.LinkedList;
import java.util.ListIterator;
public class A_4 {
    public static void main(String[] args) {
        LinkedList<Object> l1 = new LinkedList<>();
            l1.add("mustang 1969");
            l1.add("mustang GT");
            l1.add("mustang Boss429");
            l1.add("mustang Mach 1");

        ListIterator itr = l1.listIterator(l1.size());
        // while(itr.hasNext()){
        //     itr.next();
        // }
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
        
    }
}
