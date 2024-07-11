//12)  WAP to print N odd numbers.

import java.util.Scanner;
public class A_12 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int n= sc.nextInt();
        int i;
        sc.close();
        for(i=1 ; n!=0;n--){
            System.out.print(" "+ (i));
            i=i+2;
        }

        

    }
}
