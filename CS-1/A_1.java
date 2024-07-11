//1. Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;
class A_1{
public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the lenght : ");
	int l = sc.nextInt();
	System.out.println("Enter the breadth : ");
	if (l==sc.nextInt()){
	System.out.println("It is a square");
	}
	else
	System.out.println("not a Square " );
	
}
}