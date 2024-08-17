/*
    DATE : 03/06/2024
    Find minimum and maximum element in array
 */
import java.util.Scanner;
class Q2
{
    public static void main(String args[])
    {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of array : ");
        for( i=0 ; i<n ; i++ )
        {
            arr[i] = sc.nextInt();
        }

        for( i=0 ; i<arr.length-1 ; i++ )
            if(arr[i]<arr[i+1])
                arr[i+1] = arr[i];
        System.out.println("Smallest element of Array : "+arr[i]);
        for( i=0 ; i<arr.length-1 ; i++ )
            if(arr[i]>arr[i+1])
                arr[i+1] = arr[i];
        System.out.println("Largest element of Array : "+arr[i]);
    }
}