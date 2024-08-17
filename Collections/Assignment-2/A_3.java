// 3. Write a Java program to iterate through all elements in a linked list starting
// // at the specified position.

import java.util.LinkedList;
import java.util.ListIterator;

public class A_3 {
    public static void main(String[] args) {
         LinkedList<Object> l1 =new LinkedList<>();
            l1.add("person 1");
            l1.add("person 2");
            l1.add("person 3");
            l1.add("person 4");
            l1.add("person 5");
        
        ListIterator itr = l1.listIterator(2);
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
