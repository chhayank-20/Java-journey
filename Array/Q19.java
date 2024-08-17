/*
    12/07/2024
    Find Maximum product contigeous sub array 

    Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.
    Example 1:
    Input:
    N = 5
    Arr[] = {6, -3, -10, 0, 2}
    Output: 180
*/
class Q19 {
    public static void main(String args[]){
        int i, j, sum, max, arr[]={6, -3, -10, 0, 2};
        max=arr[0];
        for( i=0 ; i<arr.length ; i++ ){
            for( j=0, sum=1; j<arr.length ; j++ ){
                sum = sum*arr[j];
                if(sum>max){
                    max = sum;
                }
            }
        }
        System.out.println("Highest product sub-array : "+max);
    }
}