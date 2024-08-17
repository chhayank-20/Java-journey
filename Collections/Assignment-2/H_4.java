// 4. Write a Java program to empty an hash set.
import java.util.HashSet;
public class H_4 {
    public static void main(String args[]){
        HashSet<Object> h1=new HashSet<>();
        h1.add("trx");
        h1.add("one");
        h1.add(1293);
        h1.add("enum");
        h1.add(789);
        System.out.println(h1);

        h1.removeAll(h1);
        System.out.println(h1);
    }
}
