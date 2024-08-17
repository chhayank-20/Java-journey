// 8. Write a Java program to sort a given array list.

import java.util.ArrayList;
// import java.util.Iterator;

public class A_8 {
    public static void main(String[] args) {

        ArrayList<Object> al = new ArrayList<>();
        al.add("alan");
        al.add("thomson");
        al.add("Emily ");
        al.add("Zen");
        al.add("Jack");

        System.out.println(al);

        al.sort(null);
        System.out.println(al);        
    }
}

        // ArrayList<Integer> al = new ArrayList<>();
        // al.add(11);
        // al.add(2 );
        // al.add(3);
        // al.add("Jack");

