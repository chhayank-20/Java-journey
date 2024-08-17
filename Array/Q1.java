/*
    DATE : 03/06/2024
    Q.1 Peak an element

An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, find the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.

Example 1:
Input:
N = 3
arr[] = {1,2,3}
Output: 1
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
Example 2:
Input:
N = 2
arr[] = {3,4}
Output: 1
Explanation: 4 (at index 1) is the 
peak element as it is greater than 
its only neighbour element 3.
Constraints:
1 ≤ N ≤ 105
1 ≤ A[] ≤ 106

*/
import java.util.Scanner;
class Q1
{
    public static void main(String args[])
    {
        int i,n,result=0;
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
        {
            if(arr[i]>arr[i+1])
            {
                result++;
                break;
            }
            if(arr[i]<arr[i+1])
            {
                result++;
                break;
            }
        }


        if(result==1)
            System.out.println("Result : 1");
        else
            System.out.println("Result : 0");
    }
}