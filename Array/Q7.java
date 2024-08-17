/*
    DATE : 04/06/2024

Sub array with given sum
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

Example 1:
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.

Example 2:
Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.
1 <= N <= 105
1 <= Ai <= 109
*/

import java.util.Scanner;
class Q7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int i, j=0, sum=0, s , n=sc.nextInt();
        int arr[] = new int[n];
        boolean flag=false; 
        
        System.out.println("Enter the elememts of array : ");
        for( i=0 ; i<arr.length ; i++ )
            arr[i] = sc.nextInt();

            System.out.println("Array : ");
        for( i=0 ; i<arr.length ; i++ )
            System.out.print(arr[i]+"\t");

        System.out.println("\nEnter sum to know which elements add up to that : ");
        s = sc.nextInt();

        for( i=0 ; i<arr.length ; i++ )
        {
            sum=0;
            for( j=i ; j<arr.length ; j++ )
            {
                sum = sum+arr[j];
                if(sum==s)
                {
                    flag = true;
                    break;
                }
                if(flag)
                    break;
            }
            if(flag)
                break;
        }
        if(flag)
        {
            System.out.println(i+1+" "+(j+1));
        }
        else
            System.out.println("NO sub array add up to "+s);
   }
}