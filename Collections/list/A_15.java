// 15. Write a Java program to join two array lists.

import java.util.ArrayList;
import java.util.Collections;

public class A_15 {
    public static void main(String[] args) {
        ArrayList <Object> al = new ArrayList<>();
            al.add("one");
            al.add("two");
            al.add("three");
            al.add("four");
            al.add("five");
        System.out.println(al);
        ArrayList<Object> al1 = new ArrayList<>();
            al1.add("alan");
            al1.add("thomson");
            al1.add("Emily ");
            al1.add("Zen");
            al1.add("Jack");
        System.out.println(al1);

        al.addAll(al1);
        System.out.println(al);

        
    }
}
