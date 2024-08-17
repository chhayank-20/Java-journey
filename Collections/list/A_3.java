// 3. Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;

public class A_3 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
    
        al.add("red");
        al.add("blue");
        al.add("green");
        al.add("yellow");
        System.out.println(al);

        al.add(0,"first");
        al.add(0,"Second");
        System.out.println(al);
    }
}
