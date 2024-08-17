// 2. Write a Java program to iterate through all elements in a linked list.

import java.util.Iterator;
import  java.util.LinkedList;
public class A_2 {
    public static void main(String[] args) {
        LinkedList<Object> l1 =new LinkedList<>();
            l1.add("person 1");
            l1.add("person 2");
            l1.add("person 3");
        
        Iterator itr = l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
