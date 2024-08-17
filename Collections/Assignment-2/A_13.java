// 13. Write a Java program to remove the first and last elements from a linked list.

import java.util.LinkedList;
public class A_13 {
    public static void main(String[] args) {
        LinkedList<Object> l1 = new LinkedList<>();
        l1.add("one");
        l1.add(2);
        l1.add("fruit");
        l1.add(0);
        l1.add("three");
        System.out.println(l1);

        l1.remove(0);
        l1.remove(l1.size()-1);
        System.out.println(l1);
    }
}
