//  add or remove object , add or remove collections

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String args[]){
        ArrayList<Object> l1 = new ArrayList<Object>();
        l1.add("vikas");          // to add object 
        l1.add("goutam");
        System.out.println(l1);

        ArrayList<Object> l2 = new ArrayList<Object>();
        l2.add("Chhayank");
        System.out.println(l2.add("ok"));

        l1.addAll(l2);              // to add a collection (all object)
        System.out.println(l1);                                             

        // System.out.println(l1.remove("vikas"));        // to remove an object 
        // System.out.println(l1.removeAll(l1));          // to remove a collection 

        l1.clear();
        System.out.println(l1);
        System.out.println(l1.isEmpty());
        

    }
}
