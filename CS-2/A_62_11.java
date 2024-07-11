// A
// AB
// ABC
// ABCD
// ABCDE


public class A_62_11 {
    public static void main (String args[]){
        char a=66;
        String b="A";
        for (int i=0; i<6; i++ ){
            
            System.out.println(b);
            b=b+a;
            a++;
        }
    }    
}

