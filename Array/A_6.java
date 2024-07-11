// Find occurance of an integer number in array.
import java.util.Scanner;
public class A_6 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
//to take array as input 

        // System.out.println("\nEnter number of elemennts");
        // int n = sc.nextInt();

        // int numbers[] = new int[n];

        // for(int i=0; i<n; i++){
        //     System.out.println("Enter elemennt "+(i+1)+" : ");
        //     numbers[i]=sc.nextInt();
        // }

        // System.out.println("\nGiven array is as follows : ");
        // for(int i=0;i<n;i++){
        //     System.out.print(" "+numbers[i]);
        // }
        
// to run program without input     
        int[] numbers={1,2,3,4,5,3,2,1,4,4,5,7,54,54,2};
        System.out.println("\nEnter which no. occurence you wana find : ");
        int n = sc.nextInt();
        
// main program
        int occurance=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==n){
                occurance=occurance+1;
            }
        }

        if(occurance==0){
            System.out.println("Occurence of the number "+n+" is : 0" );
        }else{
            System.out.println("Occurence of the number "+n+" is : "+occurance);
        }
        sc.close();
    }
}