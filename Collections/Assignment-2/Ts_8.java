// 8.Write a Java program to create a reverse order view of the elements contained in a given tree set.

import java.util.Iterator;
import java.util.TreeSet;
public class Ts_8 {
    public static void main(String[] args) {
        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(10);
        ts2.add(20);
        ts2.add(30);
        ts2.add(40);
        System.out.println(ts2);

// with iterator  (dosen't changes the value in orignal set)
        Iterator <Integer> itr = ts2.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+", ");
        }
        System.out.println();
        
// with reverse method (returns a new set with reverse values)
        TreeSet<Integer> reverseSet = (TreeSet<Integer>) ts2.descendingSet();
        System.out.println(reverseSet);


    }
}
