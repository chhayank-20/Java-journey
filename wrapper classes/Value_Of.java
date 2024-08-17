public class Value_Of {
    public static void main (String args[]){

        Character c= Character.valueOf('a');
        System.out.println(c);

        Boolean b = Boolean.valueOf(true);
        System.out.println(b);

        Integer i = Integer.valueOf(12);
        System.out.println(i);

        Boolean b1 = Boolean.valueOf("true");
        System.out.println(b1);

        Boolean b2 = Boolean.valueOf("tru");
        System.out.println(b2);

        Boolean b3 = Boolean.valueOf("truE");
        System.out.println("b3 : " +b3);

        Boolean b4 = Boolean.valueOf("Riya");
        System.out.println("b4 : "+ b4);

        Float f1 = Float.valueOf(34);
        System.out.println("f1 : "+f1);
        
        Float f2 = Float.valueOf(34f);
        System.out.println("f2 : "+f2);
        
        Float f3 = Float.valueOf("34f");
        System.out.println("f3 : "+f3);
    }
}
