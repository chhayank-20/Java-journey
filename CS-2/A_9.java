//9) WAP to print N even numbers.

import java.util.Scanner;
public class A_9 {
    public static void main (String args[]){
        System.out .println("Enter the no. : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while ((n+1)!=i){
            System.out.print(" "+i*2);
            i++;
        }
        sc.close();
    }
    
}
