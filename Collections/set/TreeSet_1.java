import java.util.TreeSet;
import java.util.Iterator;
public class TreeSet_1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        
        ts.add(60);
        ts.add(30);
        ts.add(30);
        ts.add(30);      // Duplicates not allowed 
        ts.add(70);
        ts.add(10);
        ts.add(80);
        ts.add(40);
        System.out.println(ts);

        Iterator itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
