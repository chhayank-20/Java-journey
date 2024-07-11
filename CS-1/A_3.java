//A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.

import java.util.Scanner;
class A_3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary :");
        
        double salary=sc.nextInt();
        System.out.println("Enter your service year :");
        double service=sc.nextInt(); 

        if (service>5){
            System.out.println("Congrats you got a bonus of : "+(salary/20));
            System.out.println("This makes your total : "+(salary+(salary/20))+"Rs");
        }else{
            System.out.println("your salary : "+salary+"Rs");
            
        }
        sc.close();
    } 
}
