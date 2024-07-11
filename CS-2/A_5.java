//5) WAP to find out the factorial of a number.

import java.util.Scanner;

public class A_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter n for factorial : ");
        int n=sc.nextInt();
        int factorial=1;
        while (n!=1) {
            factorial=factorial*n;
            n--;
        }
        sc.close();
        System.out.print("Factorial = "+factorial);
    }
}
