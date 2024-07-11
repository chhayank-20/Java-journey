//7) WAP to check whether entered number is prime or not.
import java.util.Scanner;
public class A_7 {
    public static void main (String args[]){
        System.out .println("Enter the no. : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        // boolean a=false;
        int b=0;
        
        if (n==1)
            System.out.println("not prime");

        if(n>1) {

        while(i!=n-1){
            if(n%i==0){
                // a=true;
                b=1;
                break;     
            }
            i++;
        }

        // if (a==true)
        if(b==1)
            System.out.println("not prime.");
        else
            System.out.println("is prime. ");
        
        sc.close();
    }
    }
}
