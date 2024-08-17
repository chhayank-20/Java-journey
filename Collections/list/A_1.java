// 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.ArrayList;
public class A_1 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();

        al.add("red");
        al.add("blue");
        al.add("green");
        al.add("yellow");

        System.out.println(al);
    }
}
