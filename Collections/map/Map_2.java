import java.util.HashMap;
import java.util.Map;
// import java.util.Set;
import java.util.Iterator;

public class Map_2 {
    public static void main(String[] args) {
        HashMap<Object,Object> hm = new HashMap<>();
            hm.put(1,"two");
            hm.put(2,"two");
            hm.put(3, "hm");
            hm.put(4, "four");
            // hm.put(5, hm);
        System.out.println(hm);

        // Set s = hm.entrySet();
        // System.out.println(s);

        Iterator itr = hm.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }        

    }
}
