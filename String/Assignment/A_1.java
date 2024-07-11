// Exception Assignment-1
// 1.	Create a simple banking application in Java that allows users to withdraw money from their account. The program should handle the following exceptions:

// a.	InputMismatchException: Thrown when the user enters a non-numeric value for the withdrawal amount.
// b.	InsufficientFundsException: A custom exception that should be thrown when the user attempts to withdraw more money than they have in their account.

// The program should use a try-catch-finally block to handle these exceptions. Additionally, use a throw statement to throw the InsufficientFundsException and handle it in another catch block.

// Requirements:
// 	Create a class InsufficientFundsException that extends Exception.
// 	Create a class BankAccount with the following:
// -A private field balance to store the account balance.
// -A constructor to initialize the balance.
// -A method withdraw(double amount) that:
// -Throws an InsufficientFundsException if the amount is greater than the balance.
// -Deducts the amount from the balance if there are sufficient funds.



// package Assignment;
import java.util.HashMap;

class Err extends Exception{
    void InsufficientFundsException(){
        // Super ();
        System.out.println("You don't have Sufficient balance to do this operation.");
    }
}

class BankAccount{
    private double balance;
    String  name;

    BankAccount (String name , double balance){
        this. balance= balance;
        this.name=name;
    }
    void withdraw(BankAccount obj){
        System.out.println("Enter the Ammount to withdraw : ");

    }
}

public class A_1 {
    public static void main (String args[]){
        System.out.println("Press :\n 1 to add balance. \n 2 to withdraw.");
        java.util.Scanner sc = new java.util.Scanner (System.in);
        HashMap <BankAccount , Integer> costomer = new HashMap<>(); 
        int response=sc.nextInt();
        
        if(response==1){
            System.out.println("Enter name : ");
            String name= sc.nextLine();
            System.out.println("Enter balance you want  : ");
            int balance= sc.nextInt();
            BankAccount obj =new BankAccount(name, balance);
            // for(int i = 0 ; i< 3; i++ ){
                // costomer.put(obj[i], i);
            // }



        }else if(response==2){
            System.out.println("Enter name : ");
            String name= sc.nextLine();
            

        }else{
            System.out.println("Enter the correct choice : ");
            response=sc.nextInt();
        }
        sc.close();
    }
}
