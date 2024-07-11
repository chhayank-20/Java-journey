//6) WAP to find out the factors of a number.

import java.util.Scanner;
public class A_6edit1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("enter the no. : ");
        int n= sc.nextInt();
        int i=1, f=0;
        
        while (i!=n+1){
            if (n%i==0){
                f=f+1; }
            i++;
        }
        System.out.println(n+" has "+f+" factors.");
        i=1;    
        System.out.print("factors : ");
        while (i!=n+1){
            if (n%i==0){
                System.out.print(" "+i);
            }
            i++;
        }
        sc.close();
    } 
}
