// 11) Create an Abstract class Processor with int member variable data and method showData to display data value.
// Create abstract method process() to define processing of member data.
// Create a class Factorial using abstract class 	Processor to calculate  and print 	factorial of a number by overriding the process method.
// Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process method Ask user to enter choice (factorial 	or circle area). Also ask data to work upon; Use Processor class reference to achieve this mechanism.

import java.io.PrintStream;

abstract class Processor {
    int data ;
    void showData(){ 
        System.out.println(data);
    } 
    
    abstract void process();
}

class Factorial extends Processor{
     void process(){
    }   
}

public class A_11 {
    public static void main (String args[]){
        // System.out.println(8);
        // PrintStream.ut.println(9);

        // PrintStream onj = new PrintStream(null);
        // super.PrintStream.out.println(6);

    }
}
