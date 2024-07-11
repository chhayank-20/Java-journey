// Find the kth largest and kth smallest element in array
import java.util.Arrays;
import java.util.Scanner;
public class A_5 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter number of elemennts");
        int n = sc.nextInt();

        int numbers[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter elemennt "+(i+1)+" : ");
            numbers[i]=sc.nextInt();
        }

        System.out.println("\nGiven array is as follows : ");
        for(int i=0;i<n;i++){
            System.out.print(" "+numbers[i]);
        }
        Arrays.sort(numbers);
        
        System.out.println("\nEnter Which largest no. you want , eg- 2nd largest, 4th largest..etc...  :");
        n = sc.nextInt();

        System.out.println("\n"+n+"largest number is : "+numbers[n-1]+"\n");
        

        sc.close();

    }
}
