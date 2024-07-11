// Create a program that helps banks to maintain records. It should havefollowing facilities.
// Anybody can create current or saving account with following initial information:account number, name, balance, and branch.
// display account detail for a particular accounts.
// display total money deposited in bank.
// allow deposit and withdrawal in an account .
// for saving account opening balance and minimum balance must be 5000.
// for current account opening balance and minimum balance must be 1000.
// can not withdraw the amount from the account that makes balance less than the minimum balance.


interface i {
    void current(long number,String name,double balance,String branch);
    void saving(long number,String name,double balance,String branch);
    
}

class bank implements i{
    long number;
    String name;
    double balance;
    String branch;
    static double totalAmmount=0;

    public void current(long number,String name,double balance,String branch){
        this.number=number;
        this.branch=branch;
        this.name=name;
        this.balance=balance;
        totalAmmount=totalAmmount+balance;
    }

    public void saving(long number,String name,double balance,String branch){
        this.number=number;
        this.branch=branch;
        this.name=name;
        this.balance=balance;
        totalAmmount=totalAmmount+balance;
    }

    void display(bank obj){
        System.out.println("Name    : "+obj.name);
        System.out.println("Ph. no. : "+obj.number);
        System.out.println("Balance : "+obj.balance);
        System.out.println("Branch  : "+obj.branch);
    }

    static void displayTotalBalance(){
        System.out.println("Total Balance  : "+totalAmmount);
    }
}


class create {
    create(){
        java.util.Scanner sc =new java.util.Scanner(System.in);
        java.util.Scanner sc_d =new java.util.Scanner(System.in);
        java.util.Scanner sc_l =new java.util.Scanner(System.in);

        

        System.out.println("Enter your name : ");
        String name=sc.nextLine();
        
        System.out.println("Enter your Phone no. : ");
        long number=sc_l.nextLong();
        
        System.out.println("\t\t\tDisclimer : \n  for saving account opening balance and minimum balance must be 5000. \n  for current account opening balance and minimum balance must be 1000.\n");
        System.out.println("Enter the Balance you wana start with : ");
        double balance=sc_d.nextInt();
        
        System.out.println("Enter the branch : ");
        String branch=sc.nextLine();
        
        System.out.println("Enter 1 to make Savings Account.  OR \nEnter 2 to make Current Account   : ");
        int ac=sc.nextInt();

        bank obj =new bank();
        if(ac==1 && balance>=5000){
            obj.saving(number, name, balance, branch);
        }else if (ac!=1 && ac!=2) {
            System.out.println("Please correctly \n Enter 1 to make Savings Account.  OR \nEnter 2 to make Current Account   : ");
            ac=sc.nextInt();
            if(ac==1){
                obj.saving(number, name, balance, branch);
            }
            else{
                obj.current(number, name, balance, branch);
            }
        }else if (ac==1 && balance<5000) {
            System.out.println("Enter balance above 5000");
            System.out.println("\t\t\tDisclimer : \n  for saving account opening balance and minimum balance must be 5000. \n  for current account opening balance and minimum balance must be 1000.\n");
            System.out.println("Enter the Balance you wana start with : ");
            balance=sc_d.nextInt();
            obj.saving(number, name, balance, branch);
        }
        else if (ac==2 && balance<1000) {
            System.out.println("Enter balance above 1000");
            System.out.println("\t\t\tDisclimer : \n  for saving account opening balance and minimum balance must be 5000. \n  for current account opening balance and minimum balance must be 1000.\n");
            System.out.println("Enter the Balance you wana start with : ");
            balance=sc_d.nextInt();
            obj.saving(number, name, balance, branch);
        }
        else{
            obj.current(number, name, balance, branch);
        }
       
        obj.display(obj);

        bank.displayTotalBalance();

        sc.close();
        sc_d.close();
        sc_l.close();

    }
}

class withdraw{
    withdraw(){
        java.util.Scanner sc =new java.util.Scanner(System.in);

        // if(obj.balance<){

        // }
        System.out.println("Enter Ammount you want to withdraw : ");
        int w =sc.nextInt();

        bank obj =new bank();
        obj.balance=obj.balance-w;
        bank.totalAmmount=bank.totalAmmount-w;   



        sc.close();
    }
}

class deposit{
    deposit(){
        java.util.Scanner sc =new java.util.Scanner(System.in);
        System.out.println("Enter Ammount you want to Deposit : ");
        int d =sc.nextInt();

        bank obj =new bank();
        obj.balance=obj.balance+d;
        bank.totalAmmount=bank.totalAmmount+d;
        sc.close();    
    }   
}

public class A_16 {
    public static void main (String args[]){
        java.util.Scanner sc_i =new java.util.Scanner(System.in);

        // boolean d=true;
        // // int d=0;
        // do{
        
        System.out.println("Enter 1 to create an Account. \nEnter 2 to get your existing Account details.\nEnter 3 to Withdraw Ammount. \nEnter 4 to Deposit Ammount. ");
        int a=sc_i.nextInt();

        if(a==1){
            new create();
        }else if(a==3){
            new withdraw();
        }else if(a==4){
            new deposit();
        }else if (a!=1 && a!=2){
            System.out.println("Please correctly \n Enter 1 to make Savings Account.  OR \n Enter 2 to make Current Account   : ");
            a=sc_i.nextInt();
        }
        else{
            bank obj =new bank();
            obj.display(obj);
        }

        // System.out.println("Want to do more Operations ?\nPress 1 for Yes  OR  2 for No " );
        // int b=sc_i.nextInt();
        // if(b!=1 && b!=2){
        //     System.out.println("please choose correctly !");
        //     System.out.println("Press 1 for Yes  OR  2 for No " );
        //     b=sc_i.nextInt();
        //     if(b!=1){
        //         d=false;
        //         // d=1;
        //     }
        // } 
        // if(b!=1){
        //     d=false;
        //     // d=1;
        // }

        // }while(d==true);

        sc_i.close();
        
    }
}


