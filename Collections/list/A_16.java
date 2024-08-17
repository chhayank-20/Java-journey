// 16. Write a Java program to clone an array list to another array list.

import java.util.ArrayList;

public class A_16 {
    public static void main(String[] args) {
        ArrayList<Object> al1 = new ArrayList<>();
            al1.add("alan");
            al1.add("thomson");
            al1.add("Emily ");
            al1.add("Zen");
            al1.add("Jack");
        System.out.println(al1);

        ArrayList<Object> al2 = new ArrayList<>();
        al2= (ArrayList)al1.clone();

        System.out.println(al2);
    }
}


