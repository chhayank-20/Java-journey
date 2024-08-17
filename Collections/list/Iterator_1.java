import java.util.ArrayList;
// import java.util.*;
import java.util.Iterator;

public class Iterator_1 {
    public static void main(String[] args) {
        ArrayList<Object> l1 = new ArrayList<Object>();

        l1.add("Chhayank");
        l1.add("ok");

        Iterator itr = l1.iterator();            // printing using iterator 
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (Object object : l1) {               // printing using for-each loop
            System.out.println(object);
        }
    }
}
