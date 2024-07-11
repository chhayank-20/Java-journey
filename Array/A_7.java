// Sort the array of 0s , 1s and 2s.
import java.util.Arrays; 
public class A_7 {
    public static void main (String args[]){
        
        int[] numbers={1,0,2};
        for(int i=0;i<numbers.length;i++){
            System.out.print("  "+numbers[i]);
        }
        System.out.println("\n");
        
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print("  "+numbers[i]);
        }
    }
}