// Write a java program to impelment binary search algorithm.

// lets create the algo -

class A_33{
public static int binaryFind(int arr[] , int target){
    int start =0, end=arr.length-1, mid=(start+end)/2;
    // int n =;
    // while (n!=target) {
    //     System.out.println("print");   
    // }

    if(target<arr[mid]){
        end=mid;
        return binaryFind(arr, target);
    }else if(target>mid){
        start=mid;
        return binaryFind(arr, target);
    }else if(target==mid){
        return mid;
    }
    return -1;
}

public static void main (String args[]){

    int array[]={1,2,3,4,5,6};
    int a=5;

    int b=binaryFind(array, a);
    System.out.println(b);
}
  
}

