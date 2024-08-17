/*
    DATE : 03/06/2024
    Write a program to sort the array
 */
import java.util.Scanner;
class Q4
{
    public static void main(String args[])
    {
        int i,n,temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of array : ");
        for( i=0 ; i<n ; i++ )
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting : ");
        for( i=0 ; i<arr.length ; i++ )
        {
            System.out.print(arr[i]+"\t");
        }

        for( i=0 ; i<arr.length ; i++ )
        {
            for(int j=0 ; j<arr.length-1-i ; j++ )
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }  
        }
        System.out.println("\nArray after sorting : ");
        for( i=0 ; i<arr.length ; i++ )
        {
            System.out.print(arr[i]+"\t");
        }
    }
}