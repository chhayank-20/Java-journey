// 2. Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;
import java.util.Iterator;
public class A_2 {
    public static void main(String[] args) {
         ArrayList<Object> al = new ArrayList<>();

        al.add("red");
        al.add("blue");
        al.add("green");
        al.add("yellow");

        Iterator itr =al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
