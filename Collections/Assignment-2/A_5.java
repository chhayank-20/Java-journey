// 5. Write a Java program to insert the specified element at the specified
// position in the linked list.

import java.util.LinkedList;

public class A_5 {
    public static void main(String[] args) {
        LinkedList<Object> l1 =new LinkedList<>();
        l1.add("person 1");
        l1.add("person 2");
        l1.add("person 3");
        l1.add("person 4");
        l1.add("person 5");
        System.out.println(l1);
        
        l1.add(2, "person 6");
        System.out.println(l1);
    }
}
