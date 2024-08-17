// 1. Write a Java program to append the specified element to the end of a linked list.

import java.util.LinkedList;
// import java.util.List;

public class A_1 {
    public static void main(String[] args) {
        LinkedList<Object> l1 =new LinkedList<>();
            l1.add("person 1");
            l1.add("person 2");
        System.out.println(l1);
        
            l1.add("person 3");
        System.out.println(l1);
    }    
}
