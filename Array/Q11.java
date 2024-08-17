/*
    DATE : 10/06/2024

    Count pair with given sum.

*/
import java.util.Scanner;
class Q11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        int i,j,count=0;
        for( i=0 ; i<n ; i++ )
            arr[i] = sc.nextInt();

        System.out.print("Array [] :");
        for( i=0 ; i<arr.length ; i++ )
            System.out.print(arr[i]+"   ");
    
        System.out.println("\nEnter the sum(number) to check no. of pairs : ");
        int k = sc.nextInt();
        for( i=0 ; i<n ; i++ )
        {
            for( j=i+1 ; j<n ; j++ )
            {   
                
                if( (arr[i]+arr[j]) == k )
                    count++;
            }
        }
        if(count>0)
            System.out.print("Number of pair found : "+count);
        else
            System.out.print("NO piar add up to Number "+k);
        
    }
}