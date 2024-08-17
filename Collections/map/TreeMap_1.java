
import java.util.TreeMap;

public class TreeMap_1 {
    public static void main(String[] args) {
        TreeMap<Object,Object> tm = new TreeMap<>();
            tm.put(2,"two");
            tm.put(1,"one");
            tm.put(3,"three");
            tm.put(5,"five");
            tm.put(4,"four");
        // it is sorted by default
        System.out.println(tm);

        System.out.println(tm.ceilingEntry(2));
        // if value dosent exist , then it will give null value 
        System.out.println(tm.ceilingEntry(2));
        System.out.println(tm.ceilingKey(9));
        System.out.println(tm.ceilingKey(2));
        System.out.println(tm);

        System.out.println(tm.floorKey(8));
        System.out.println(tm.floorEntry(9));
        System.out.println(tm.floorKey(2));
        System.out.println(tm);

    //  pollFirstEnrty removes first enrty
        tm.pollFirstEntry();
        System.out.println(tm);
    //  pollLastEntry removes Last enrty
        tm.pollLastEntry();
        System.out.println(tm);

    }
}