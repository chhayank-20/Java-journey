import java.util.ArrayList;
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList(4);
        l1.add(0,"person0");
        l1.add(1,"person1");
        l1.add(0,"person2");
        System.out.println(l1 + "\n");

        ArrayList l2 = new ArrayList(l1);
        System.out.println(l2.size());
        System.out.println(l2 +"\n");

        //  set() method replaces the value of index with the nwe value , it dosent shifts the value 
        l2.set(2,"person 3");
        System.out.println(l2);

    }
}
