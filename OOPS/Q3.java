/*
Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
init - to input X and Y from user
add - to add X and Y and store in R
multiply - to multiply X and Y and store in R
power - to calculate X Y and store in R
display- to display Result R

 */
import java.util.Scanner;
class MathOperation{

    private int x;
    private int y;
    private int r;

    public void setData(int x,int y){

        this.x = x;
        this.y = y;
    }

    public void add(){

       r = x+y;
    }
    public void multi(){

       r = x*y;
    }
    public void power(){

        r = 1;
        for(int i = 1;i <= y;i++)
            r = r*x;
    }
    public void display(){

        System.out.println("Result : "+r);
    }
}

class Q3{

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        MathOperation obj = new MathOperation();
        
        System.out.print("Enter two numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        obj.setData(x,y);
        obj.add();
        obj.display();
        obj.multi();
        obj.display();
        obj.power();
        obj.display();
    }
}