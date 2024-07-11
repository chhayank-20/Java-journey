//8) WAP to print Fibonacci series.

import java.util.Scanner;
public class A_8 {
    public static void main (String args []){
        System.out .println("Enter the no. of values to print for fibonacci series : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=0, b=1, c=0;
        int i=0; 

        while(i!=n){
            System.out.print(" "+c);
            i++;
            a=c;
            c=c+b;
            b=a;     
        }
        sc.close();
    }    
}
