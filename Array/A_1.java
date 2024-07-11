// An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
// Given an array arr[] of size N, find the index of any one of its peak elements.
// Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.
// to find peak element and print its value ..

import java.util.Scanner;
public class A_1 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elemennts");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int peak=0, k=0;

        for(int i=0; i<arr.length; i++){
            System.out.println("Enter elemennt "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<n-1; j++){
            k=j+1;
            if(arr[j]<arr[k]){
               peak = arr[k]; 
            }
             
        }
        if(arr[0]>peak){
            peak = arr[0]; 
        }
        

        if(peak==0){
            System.out.println("output : 0" ); 
        }else{
        System.out.println("output : 1" );
        System.out.println("peak value : "+peak);
        }
        sc.close();
    }
}
