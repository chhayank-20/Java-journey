// 18. Write a Java program to test whether an array list is empty or not.

import java.util.ArrayList;
public class A_18 {
    public static void main(String[] args) {
        ArrayList <Object> al = new ArrayList<>();
            al.add("one");
            al.add("two");
            al.add("three");
            al.add("four");
            al.add("five");
        System.out.println(al);

        ArrayList <Object> al2 = new ArrayList<>();

        System.out.println(al.isEmpty());
        System.out.println(al2.isEmpty());
    }
}
