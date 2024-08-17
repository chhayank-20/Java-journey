import java.util.HashSet;

public class Hashset_1 {
    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<Object>();

        hs.add(34);
        hs.add(23);
        hs.add("ok");
        hs.add("Chhayank");
        hs.add(true);
        hs.add('a');

        System.out.println(hs);
        hs.remove(23);
        System.out.println(hs);

    }    
}
