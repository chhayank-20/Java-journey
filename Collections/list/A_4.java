// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;

public class A_4 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");

        System.out.println(al.get(0));
        System.out.println(al.get(2));
    
    }
}
