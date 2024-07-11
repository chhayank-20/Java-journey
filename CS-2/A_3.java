//3) WAP to find out the sum of N natural number.
import java.util.Scanner;
public class A_3 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value n : ");
        int n=sc.nextInt();
        
        int sum=0;

        while(n>0){
            sum = sum+n;
            n--;
        }

        System.out.println("sum of N natural no. : "+sum);
    
        sc.close();
    }
    
}
