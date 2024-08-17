import java.util.ArrayList;

class Array_List1{
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<Object>();

        al.add(23);
        al.add("ok");
        al.add("Chhayank");
        al.add(true);
        al.add('a');

        System.out.println(al);
        al.remove(2);
        System.out.println(al);
    }
}