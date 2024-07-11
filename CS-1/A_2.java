/* A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.
 */

import java.util.Scanner;
class A_2{
public static void main (String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Quantiy : ");
	int Q = sc.nextInt();5
	// System.out.println("Enter the breadth : ");
    int total= Q*100;
	if (Q>10){
	System.out.println("Bill Ammount : " + (total-(total/10)) );
	}
	else
	System.out.println("Bill Ammount : " +total );
	
}
}