// Find minimum and maximum element in array

import java.util.Arrays;
import java.util.Scanner;
public class A_2 {
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
         
        System.out.println("\n\nGreatest : "+numbers[n-1]);
        System.out.println("Smallest : "+numbers[0]+"\n");
        

        sc.close();

    }
}
