// 5. Write a Java program to update an array element by the given element.

import java.util.ArrayList;
public class A_5 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");
        System.out.println(al);
        al.set(0, "five");       // updated
        
        System.out.println(al);

    }
}
