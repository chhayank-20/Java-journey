// write a program that gives values whose sum is nearest to zero.
import java.util.Arrays;
class Nearest_to_zero {
    public static void main(String[] args) {
    int arr[]= {-3,-5,-6,-1,11,3,4,2,5,0};
    Arrays.sort(arr);
    int k=0;
    for(int j=0;j<5;j++){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==j){
            k=i;
            break;
        }
    }
    if(k!=0){break;}
    }
    System.out.println("two numbers whos sum is nearest to zero are : "+arr[k-1]+" & "+arr[k+1]);
    }
}