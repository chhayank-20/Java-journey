//10) WAP to print Even numbers upto N.

import java.util.Scanner;
public class A_10 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int n= sc.nextInt();
        int i=0;
        while(i!=n+1){
            if(i%2==0){
            System.out.print(" "+i);
            }
            i++;    
        }
        sc.close();

    }
}
