/*
    DATE : 03/06/2024
    Find the kth largest and kth smallest element in array.
 */
import java.util.Scanner;
class Q5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int i, temp, k, n=sc.nextInt(),arr[] = new int[n];;
        System.out.print("Enter the elements of array : ");
        for( i=0 ; i<n ; i++ )
        {
            arr[i] = sc.nextInt();
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

        System.out.println("Enter the no. to know that no. of smallest and largest element : ");
        k = sc.nextInt();

        System.out.println(k+"th Smallest element is "+arr[k-1]);
        System.out.println(k+"th largest element is "+arr[arr.length-k]);
    }
}