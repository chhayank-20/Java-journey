// 11. Write a Java program to reverse elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class A_11 {
    public static void main (String args[]){
        ArrayList<Object> al = new ArrayList<>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");
        al.add("five");
        System.out.println(al);
        System.out.println(al.size());

        // reverse by logic
        for(int i=0;i<al.size()/2;i++){
            Object temp1 = al.get(i);
            Object temp2 = al.get(al.size()-(i+1));
            al.set(al.size()-(i+1), temp1);
            al.set(i,temp2);
        }
        System.out.println(al);
        
        // reverse by method 
        Collections.reverse(al);
        System.out.println(al);

        // reverse by swap method
        for(int i=0;i<al.size()/2;i++){
            Collections.swap(al, i, al.size()-(i+1));
        }
        System.out.println(al);

    }
}
