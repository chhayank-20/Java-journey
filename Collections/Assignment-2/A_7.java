// Write a Java program to insert the specified element at the front of a linked
// list.

import java.util.LinkedList;
public class A_7 {
    public static void main(String args[]){
        LinkedList<Object> l1 = new LinkedList<>();
        l1.add("person 1");
        l1.add("person 2");
        l1.add("person 3");
        l1.add("person 4");
        System.out.println(l1);

        l1.addFirst(30);
        l1.addFirst(false);
        System.out.println(l1);
    }
}
