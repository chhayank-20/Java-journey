/*
Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
init - to input radius from user
calc - to calculate area
display- to display area

 */
import java.util.Scanner;
class Area{

    private double r;

    public void setData(double r){

        this.r = r;
        
    }

    public double getArea(){

        return 3.14*r*r;
    }
}
class Q2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.print("Enter radius of circle : ");
        double r = sc.nextDouble();

        obj.setData(r);
        double x = obj.getArea();

        System.out.print("Area of circle : "+x);
        
    }
}