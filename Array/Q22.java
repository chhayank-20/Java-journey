/*
    13/07/2024
    C program to find nearest lesser and greater element in array
    Given an array of N elements and we have to find nearest lesser and nearest greater element using C program.
    Example:
    Input:
    Enter the number of elements for the arrray : 3  
 
    Enter the elements for array_1.. 
    array_1[0] : 1   
    array_1[1] : 2   
    array_1[2] : 3   
 
    Enter the number : 2 
 
    Output:
    Element lesser than 2 is : 1 
    Element greater than 2 is : 3
*/
class Q22 {
    public static void main(String args[]){
        int i, j, n=6, min=0, max=0, arr[]={4,5,2,8,6,4};
        boolean flag=false;
        for( i=0 ; i<arr.length ; i++ ){
            for( j=i+1 ; j<arr.length ; j++ ){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for( i=0 ; i<arr.length ; i++ )
            if(arr[i]==n){
                flag=true;
                break;
            }
            
        if(flag && arr[i]==n)  
        {
            if(i==0){
                min=arr[0];
            }
            else {
                for( j=i ; j>0 ; j-- ){
                    if(j==0){
                        min = arr[j];
                        break;
                    }
                    if(arr[j-1]<arr[i]){
                        min = arr[j-1];
                        break;
                    }
                }
            }
            if(i==arr.length-1)
                max = arr[arr.length-1];
            else{
                for( j=i ; j<arr.length-1 ; j++ ){
                    if(j==arr.length-1){
                        max = arr[j];
                        break;
                    }
                    if(arr[j+1]>arr[i]){
                        max = arr[j+1];
                        break;
                    }
                }
            }
            System.out.println("Element lesser than "+n+" is : "+min);
            System.out.println("Element greater than "+n+" is : "+max);
        }
        else
             System.out.println("Entered element NOT found");
    }
}