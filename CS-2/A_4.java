//4) WAP to print table of a number
import java.util.Scanner;
public class A_4 {
    public static void main (String args[]){
        
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter value n for table : ");
            int n=sc.nextInt();
            int i=1;
            while(i<11){
                System.out.println(n+" x "+i+" = "+(n*i));
                i++;
            }
            sc.close();
    }
}
