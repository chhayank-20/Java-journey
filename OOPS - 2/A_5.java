// 5) Create class OneBHK with instance variable roomArea , hallArea and price.
// Create default and parameterized constructor.
// Method show(): to print OneBHK data member information.

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

public class A_5{
    public static void main(String ...x){
        OneBHK obj = new OneBHK();
        obj.show();
    }
}