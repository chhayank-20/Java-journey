/*
    16/17/2024
    Write a java program to implement selection sort algoritm
*/
class Q35 {
    public static void main(String args[]){
        int i, j, p=0,min, arr[] = {1,5,4,2,7,10,4,8};//1 2 4 4 5 7 8 10
        for( i=0 ; i<arr.length ; i++ ){
            for( j=i+1 , min=arr[i]; j<arr.length ; j++ ){
                if(arr[j]<min){
                    min = arr[j];
                    p=j;
                }
            }
            if(arr[i]>min){
                int temp = arr[i];
                arr[i] = min;
                arr[p] = temp;
            }
            System.out.print(arr[i]+" ");
        }
    }
}