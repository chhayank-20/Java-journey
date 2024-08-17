// 10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.

import java.util.LinkedList;
public class A_10 {
    public static void main(String[] args) {
        LinkedList<Object> l1 =new LinkedList<>();
            l1.add("one");
            l1.add("two");
            l1.add("one");
            l1.add("three");
        System.out.println(l1);

        // using indexOf() method
        System.out.println(l1.indexOf("one"));     // prints first index of the value
        System.out.println(l1.lastIndexOf("one"));
    }
}
