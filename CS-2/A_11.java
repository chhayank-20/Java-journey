//WAP to print odd numbers upto N.

import java.util.Scanner;
class A_11 {
    public static void main (String[] tt){
        System.out.println("enter the no. : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        while(i!=n){
            if(i%2==0){
            System.out.print(" "+(i+1));
            }
            i++;
        }sc.close();

    }

}