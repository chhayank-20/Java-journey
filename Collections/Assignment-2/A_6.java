// 6. Write a Java program to insert elements into the linked list at the first and last positions.

import java.util.LinkedList;
public class A_6 {
    public static void main(String[] args) {
        LinkedList<Object> l1 = new LinkedList<>();
            l1.add("person 1");
            l1.add("person 2");
            l1.add("person 3");
            l1.add("person 4");
        System.out.println(l1);
            l1.add(0,"person 5");
            l1.add(l1.size(),"person 0");
        System.out.println(l1);
    }
}
