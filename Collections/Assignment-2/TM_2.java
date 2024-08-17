// 2. Write a Java program to copy Tree Map's content to another Tree Map./

import  java .util. TreeMap;
public class TM_2 {
    public static void main(String[] args) {
        TreeMap<Object,Object> t1 = new TreeMap<>();
        t1.put(4,"four");
        t1.put(6,"six");
        t1.put(8,"eight");
        t1.put(2,"two");
        t1.put(10,"ten"); 
        System.out.println(t1);

        TreeMap<Object,Object> t2 = new TreeMap<>();
        t2.putAll(t1);
        System.out.println("\nt2 :");
        System.out.println(t2);

        TreeMap<Object,Object> t3 = (TreeMap<Object,Object>)t2.clone();
        System.out.println("\nt3 :");
        System.out.println(t3);
        
    }
}
