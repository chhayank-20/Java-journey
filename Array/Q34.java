/*
   14/07/2024
   Write a java program to implement linear search
*/
class Q34 {
    public static void main(String args[]){
        int i, n=1, arr[] = {5,1,6,8,4,2};
        boolean flag = true;
        for( i=0 ; i<arr.length ; i++ )
            if(arr[i]==n){
                flag = false;
                break;
            }
        if(flag==false)
            System.out.println("Element found ");
        else
            System.out.println("Element NOT found ");
    }
}