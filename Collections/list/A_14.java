// 14. Write a Java program that swaps two elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class A_14 {
    public static void main(String[] args) {
        ArrayList <Object> al = new ArrayList<>();
            al.add("one");
            al.add("two");
            al.add("three");
            al.add("four");
            al.add("five");
        System.out.println(al);

        Collections.swap(al,0,3);
        System.out.println(al);

    }
}
