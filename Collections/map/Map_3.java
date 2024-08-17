import java.util.HashMap;
// import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class Map_3 {
    public static void main(String[] args) {
         HashMap<Object,Object> hm = new HashMap<>();
            hm.put(1,"two");
            hm.put(2,"two");
            hm.put(3, "hm");
            hm.put(null, "four");
        System.out.println(hm);
        System.out.println(hm.size());

        //  iterator
        Iterator itr = hm.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
        
        System.out.println(hm.containsKey(3));
        System.out.println(hm.containsValue("our"));

    // remove
        System.out.println(hm.remove(2));
        System.out.println(hm.remove(1, "two"));
        System.out.println(hm.size());
    // remove All
        hm.clear();

        System.out.println(hm);
    }
}
