// 6) Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
// Create default and parameterized constructor.
// Method show(): to print all data member information.
// Write main function in another class(Say XYZ) and store three TwoBHK flat’s.information and print information using show method. Also print total amount of all flats.

class OneBHK{
    int roomArea;
    int hallArea;
    int price;

    void show(){
        System.out.println("RoomArea : "+roomArea);
        System.out.println("HallArea : "+hallArea);
        System.out.println("Price    : "+price);
    }
}

class TwoBHK extends OneBHK{
    int room2Area;
    int totalAmmount;
    TwoBHK(){
        java.util.Scanner sc = new java.util.Scanner (System.in);

        // TwoBHK []obj= new TwoBHK[3];
        for(int i=0;i<3;i++){
        System.out.println("Enter Room 1 Area : ");
        int roomArea =sc.nextInt();
        System.out.println("Enter Room 2 Area : ");
        int room2Area =sc.nextInt();
        System.out.println("Enter Hall Area   : ");
        int hallArea =sc.nextInt();
        System.out.println("Enter Price       : ");
        int price =sc.nextInt();

        new TwoBHK(roomArea, room2Area,price,hallArea);

        }
        sc.close();
    }
    TwoBHK(int roomArea, int room2Area, int price, int hallArea){
        this.hallArea=hallArea;
        this.price=price;
        this.room2Area=room2Area;
        this.roomArea=roomArea;
        totalAmmount +=price;
    }
    void show(){
        System.out.println("RoomArea : "+roomArea);
        System.out.println("HallArea : "+hallArea);
        System.out.println("Price    : "+price);

    }
    // void totalAmmount(){
    //     System.out.println("Total Ammount : "+totalAmmount);
    // }
}

public class A_6 {
    public static void main(String args[]){
        TwoBHK obj =new TwoBHK();
        new TwoBHK();
        for (int i=0; i<3;i++){
            obj.show();
        }
        System.out.println(obj.totalAmmount);
        
    }    
}
