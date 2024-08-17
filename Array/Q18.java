/*
    12/07/2024
    Find largest sum contigeous sub array
    Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

    Example 1:
    Input:
    N = 5
    Arr[] = {1,2,3,-2,5}
    Output:
    9
*/
class Q18 {
    public static void main(String args[]){
        int i, j, sum, max, arr[]={-1,-2,-3,-4};
        max=arr[0];
        for( i=0 ; i<arr.length ; i++ ){
            for( j=0, sum=0; j<arr.length ; j++ ){
                sum = sum+arr[j];
                if(sum>max){
                    max = sum;
                }
            }
        }
        System.out.println("Highest Sum : "+max);
    }
}