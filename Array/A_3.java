// Write a program to reverse the array.

import java.util.Scanner;
// import java.util.Arrays;

public class A_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elemennts");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        int ray[] =new int[n];
        int i=0;
         
        for( i=0; i<arr.length; i++){
            System.out.println("Enter elemennt "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        

        System.out.print("\n Given array :  " );
        for( i=0; i<arr.length; i++){
            System.out.print("  "+arr[i]);     
        }
        i=0;
        while(n!=0){
            ray[i]=arr[n-1];
            i++;
            n--;
        }
        System.out.print("\n Revesed array :  " );   
        for( i=0; i<ray.length; i++){
            System.out.print("  "+ray[i]);     
        }
        sc.close();
        
    }
}
