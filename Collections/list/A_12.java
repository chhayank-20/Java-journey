// 12. Write a Java program to extract a portion of an array list.

import java.util.ArrayList;
import java.util.List;
public class A_12 {
    public static void main(String[] args) {
            ArrayList <Object> al = new ArrayList<>();
            al.add("one");
            al.add("two");
            al.add("three");
            al.add("four");
            al.add("five");
            List<Object> al2 = al.subList(0, al.size()-3);

            System.out.println(al2);
            
    }
}
