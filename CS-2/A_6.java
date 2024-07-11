//6) WAP to find out the factors of a number.

import java.util.Scanner;
public class A_6 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("enter the no. : ");
        int n= sc.nextInt();
        int i=1, f=0;
        int[] factors;
        factors =new int[n+1] ;
        while (i!=n+1){
            if (n%i==0){
                f=f+1;
                factors[i]=i;        
            }
            i++;
        }
        i=0;    
        System.out.println(n+" has "+f+" factors.");
        System.out.print("factors : ");
        while(i!=n+1){
            if (factors[i]!=0) {
                System.out.print(factors[i]+" ");        
            }
            i++;
        }
        sc.close();
    } 
}
