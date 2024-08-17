// 8. Write a Java program to insert the specified element at the end of a linked
// list.

import java.util.LinkedList;

public class A_8 {
    public static void main(String[] args) {
        LinkedList<Object> l1 = new LinkedList<>();
            l1.add("one");
            l1.add("two");
            l1.add("three");
            l1.add("four");
            l1.add("five");
        System.out.println(l1);    
            l1.add(l1.size(),"ok");
            // l1.add("we");
        System.out.println(l1);
    }
}
