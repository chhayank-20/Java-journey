/*
   15/07/2024
    Write a java program to impelment binary search algorithm
*/
class Q33 {
    public static void main(String args[]){
        int i, j, n=2, low, mid, high, arr[]={2,1,5,7,8,5};
        low = arr[0] ; high = arr[arr.length-1];
        boolean flag = false;
        for( i=0 ; i<arr.length ; i++ ){
            for( j=i+1 ; j<arr.length ; j++ )
            {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for( i=0 ; i<arr.length ; i++ ){
            mid = (low+high)/2;
            if(arr[mid] == n){
                flag = true;
                break;
            }
            else{
                if(arr[mid]>n)
                    high = mid-1;
                else
                    low = mid+1;
            }
        }
        if(flag)
            System.out.println("Element found");
        else
            System.out.println("Element NOT found");
    }
}