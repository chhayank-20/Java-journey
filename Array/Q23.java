/*
    13/07/2024
    Write a Java program to find the sum and average of one dimensional integer array.
*/
class Q23 {
    public static void main(String args[])
    {
        int i, arr[]={4,8,5,3,8,1};
        float sum=0, avg=0;
        for( i=0 ; i<arr.length ; i++ )
            sum = sum+arr[i];
        avg = (float)(sum/arr.length);
        System.out.println("Sum : "+sum+"\nAverage : "+avg);
    }
}