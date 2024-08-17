import java.util.HashSet;
import java.util.Iterator;
public class Iterator_1 {
    public static void main(String[] args) {
        HashSet<Object> l1= new HashSet<Object>();
        l1.add("ajax");
        l1.add(90);
        l1.add(true);
        System.out.println(l1);

        Iterator itr = l1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        // while (itr.hasPrevious()) {   // dosents allows previous method as , it is Iterator iterface
        //     System.out.println(itr.previous());
        // }

    }
}
