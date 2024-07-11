//   Create class Product (pid, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
// Accept five product information from user and store in an array
// Find Pid of product with highest price.
// Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single product=price of product * quantity of product).

class product{
    private String name;
    private int price;
    private int Qnt;
    public int pID;
    public int totalPrice;
    product (String name , int price , int Qnt, int pID){
        this.Qnt=Qnt;
        this.price = price;
        this.name=name;
        this.pID=pID;
    }
}

public class A_18 {
    public static void main (String...x){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        boolean a=true;
        int highestPrice =0;
        int h_pID=0;
        product obj[] =new product[5];
        int i=0;
        while ( a=true) {
            
            System.out.println("Enter product name :");
            sc.next();
            String name = sc.nextLine();
            System.out.println("Enter product ID :");
            int pID = sc.nextInt();
            System.out.println("Enter product price :");
            int price = sc.nextInt();
            System.out.println("Enter product Quantity :");
            int Qnt = sc.nextInt();
            
            obj[i]= new product ( name , price , Qnt, pID);
            obj[i].totalPrice=Qnt*price;
            if(highestPrice<obj[i].totalPrice){
                highestPrice=obj[i].totalPrice;
                h_pID=obj[i].pID;
            }
            i++;

            System.out.println("wana add more products Y / N :");
            char  r  = sc.next().charAt(0);
            if(r=='n'||r=='N'){
                a=false;
                break;
            }
        }

        int totalAmmount=0;
        for(int k =0 ; k<i;k++){
            totalAmmount =totalAmmount+obj[k].totalPrice;
        }
        System.out.println("Total Ammount spent : "+totalAmmount);

        System.out.println("Highest Price of product purchased : "+highestPrice);
        System.out.println("ID of poduct with Higest price : "+h_pID);

    }
}
