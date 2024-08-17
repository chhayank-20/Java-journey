// 9. Write a Java program to copy one array list into another.

import java.util.ArrayList;
public class A_9 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add("alan");
        al.add("thomson");
        al.add("Emily ");
        al.add("Zen");
        al.add("Jack");

        ArrayList<Object> al2 = new ArrayList<>();
        al2.addAll(al);
        System.out.println(al2);
    }
}
