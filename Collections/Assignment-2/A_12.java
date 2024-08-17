// 12. Write a Java program to remove a specified element from a linked list.

import java.util.LinkedList;
public class A_12 {
    public static void main(String arg[]){
        LinkedList<Object> l1= new LinkedList<>();
        l1.add("one");
            l1.add("two");
            l1.add("one");
            l1.add("three");
        System.out.println(l1);

        l1.remove("one");
        System.out.println(l1);

        l1.remove(2);
        System.out.println(l1);
    }
}
