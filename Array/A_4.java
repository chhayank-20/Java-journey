// Write a program to sort the array

import java.util.Scanner;
import java.util.Arrays;

public class A_4{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter no. of elements : ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        int i;
        
        for(i=0;i<arr.length;i++){
            System.out.println("Enter element"+i+" : ");
            arr[i]=sc.nextInt();
        }
        sc.close();

        System.out.println("Given array :");
        for(i=0;i<arr.length;i++){
            System.out.print("  "+arr[i]);
        }

        Arrays.sort(arr);
        System.out.println("\n Sorted array :");
        for(i=0;i<arr.length;i++){
            System.out.print("  "+arr[i]);
        }
        sc.close();
    } 
}
