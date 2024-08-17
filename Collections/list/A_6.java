// 6. Write a Java program to remove the third element from an array list.

import java.util.ArrayList;

public class A_6 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");
        System.out.println(al);
        al.remove("one");
        
        System.out.println(al);
        al.remove(2);

        System.out.println(al);
        
    }
}
