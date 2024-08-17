// 13. Write a Java program to compare two array lists.

import java.util.ArrayList;

public class A_13 {
    public static void main (String args []){
        ArrayList <Object> al = new ArrayList<>();
            al.add("one");
            al.add("two");
            al.add("three");
            al.add("four");
            al.add("five");
        ArrayList<Object> al1 = new ArrayList<>();
            al1.add("alan");
            al1.add("thomson");
            al1.add("Emily ");
            al1.add("Zen");
            al1.add("Jack");
        ArrayList <Object> al2 = new ArrayList<>();
            al2.add("one");
            al2.add("two");
            al2.add("three");
            al2.add("four");
            al2.add("five");
            
        if(al.equals(al2)){
            System.out.println("a and a2 are equal.");
        }
        if(al.equals(al1)){
            System.out.println("a and a1 are equal.");
        }
        if(al2.equals(al1)){
            System.out.println("a1 and a2 are equal.");
        }

    }
}
