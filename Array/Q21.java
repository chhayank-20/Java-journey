/*
    12/07/2024
    Max Sum in configuration

    Given an array(0-based indexing), you have to find the max sum of i*A[i] where A[i] is the element at index i in the array.The only operation allowed is to rotate(clock-wise or counter clock-wise) the array any number of times.
    Example 1:
    Input:
    N = 4
    A[] = {8,3,1,2}
    Output: 29
*/
class A21 {
    public static void main(String args[]){
        int i,j,mul,max=0, arr[]={8,3,1,2};
        RotateArray r = new RotateArray();
        for( i=0 ; i<arr.length ; i++ ){
            for( j=0, mul=0 ; j<arr.length ; j++ ){
                mul = (arr[j]*j)+mul;
            }
            if(mul>max)
                max=mul;
            arr = r.rotate(arr);
        }
            System.out.print(max);
    }
}
class RotateArray{
    public int[] rotate(int a[])
    {
        int temp = a[a.length-1];
        for ( int i=a.length-1 ; i>0 ; i--)  
        {
            a[i] = a[i - 1];
        }
        a[0] = temp;
        return a;
    }
}