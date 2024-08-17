/*
    DATE : 10/06/2024

    Write a program to cyclically rotate array by one.

*/

class Q10
{
    public static void main(String args[])
    {
        
        int i, arr[] = {2,5,8,6,4,6};
        System.out.print("Array [] :");
        for( i=0 ; i<arr.length ; i++ )
            System.out.print(arr[i]+"   ");

        int temp = arr[arr.length-1];
        
        for( i=arr.length-1 ; i>0 ; i-- )
            arr[i] = arr[i-1];
        arr[0] = temp ;
        System.out.print("\nArray after one cyclical rotation :");
        for( i=0 ; i<arr.length ; i++ )
            System.out.print(arr[i]+"   ");
    }
}