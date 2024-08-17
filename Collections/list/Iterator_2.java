import java.util.*;

public class Iterator_2 {
    public static void main(String[] args) {
        ArrayList<Object> l1 = new ArrayList<Object>();
        l1.add("chhayank");
        l1.add("ok");

        ListIterator itr = l1.listIterator();            // printing using iterator 
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
        // itr.set(itr );
        
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
        
    }
}
