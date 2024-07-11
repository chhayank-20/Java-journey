import java.util.Scanner;
class Q1{
      
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Test obj = new Test(a,b);

        System.out.println("Sum = "+obj.add());
        System.out.println("Subtraction = "+obj.sub());
        System.out.println("Multiplication = "+obj.multi());
        System.out.println("Division = "+obj.div());
    }
}

class Test{

    private int a;
    private int b;
    public Test(){}
    public Test(int a,int b){

        this.a = a;
        this.b = b;
    } 
    public int add(){

        return a+b;
    }
    public int sub(){

        return a-b;
    }
    public int multi(){

        return a*b;
    }
    public double div(){

        return (double)a/b;
    }
    public void setA(int a){

        this.a = a;
    }
    public void setB(int b){

        this.b = b;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
}