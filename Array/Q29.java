/*
   14/07/2024
   Suppose a one-dimensional array AR containing integers is arranged in ascending order. Write a java program to search for an integer from AR with the help of Binary search method, 
*/
class Q29 {
    public static void main(String args[]){
        int i, n=8, mid, high, low, ar[]={1,2,5,5,7,8};
        boolean flag=false;
        low = 0 ; high=ar.length-1;
        for( i=0 ; i<ar.length ; i++ ) {
            mid = (low+high)/2;
            if(ar[mid] == n){
                flag = true;
                break;
            }
            else if(ar[mid]>n)
                high = mid-1;
            else
                low = mid+1;
        }
        if(flag)
            System.out.println("Element found");
        else
            System.out.println("Element NOT found");
    }
}