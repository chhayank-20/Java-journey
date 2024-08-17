// 11. Write a Java program to display elements and their positions in a linked list.
import java.util.LinkedList;
public class A_11 {
    public static void main (String args []){
        LinkedList<Object> l1 = new LinkedList<>();
        l1.add("person 1 ");
        l1.add("person 2 ");
        l1.add("person 3 ");
        l1.add("person 4 ");
        System.out.println(l1);

        // l1.indexOf(l1);
        System.out.println(l1.indexOf(l1));  // if position is not found, it will return -1 ;

        System.out.println(l1.indexOf("person 3 "));
        System.out.println(l1.indexOf("person 2 "));

    }
}
