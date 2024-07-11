//2) WAP to print N natural number.  
import java.util.Scanner ;
class A_2 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value n : ");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("please enter a natural number.");
            n=sc.nextInt();
        }
        int i=1;
        while(i!=n+1){
            System.out.println(i+"\t");
            i++;
        }
        sc.close();

    }
}