// WAP check if a String contains only digits.

interface i{
    void contains(String str);
}

public class A_14 implements i{
    public void contains(String str){
        try {
            Integer.parseInt(str);    
            System.out.println("contains digits");
        } catch (Exception e) {
            System.out.println("not contains digits");
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the String : ");        
        java.util.Scanner sc =new java.util.Scanner (System.in);
        String str =sc.nextLine();
        
        A_14 obj=new A_14();
        obj.contains(str);
        sc.close();
    }
}
