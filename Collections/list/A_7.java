// 7. Write a Java program to search for an element in an array list.

import java.util.ArrayList;
import java.util.Iterator;
public class A_7 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add("Alan");
        al.add("Emily ");
        al.add("Zen");
        al.add("Jack");
        System.out.println(al);

        String data = "alan";
        boolean bool = true;
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            if(itr.next().toString().toLowerCase().equals(data)){
                bool =false;
            } 
        }
        if (bool==false) {
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
}
