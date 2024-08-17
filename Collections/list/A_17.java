// 17. Write a Java program to empty an array list.

import java.util.ArrayList;

public class A_17 {
    public static void main(String[] args) {
        ArrayList<Object> al1 = new ArrayList<>();
            al1.add("alan");
            al1.add("thomson");
            al1.add("Emily ");
            al1.add("Zen");
            al1.add("Jack");
        System.out.println(al1);

        al1.clear();
        System.out.println(al1);
    }
}
