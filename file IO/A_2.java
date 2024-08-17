// Que. 2 What is Serialization ? Write a java program to store the object into the file.

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
// import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class A_2 {
   public static void main(String[] args) {
    String name = "test2.txt";

    Details obj1= new Details("chhayank",20);
    Details obj2= new Details("Ajax",212);
        try {
            // FileInputStream file= new FileInputStream(name);
            FileOutputStream file = new FileOutputStream(name);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(obj1);
            out.writeObject(obj2);
            out.flush();
            out.close();
    
        } catch (Exception e) { 
        e.printStackTrace();}    

        try {
            FileInputStream file = new FileInputStream(name);
            ObjectInputStream ois = new ObjectInputStream(file);
            
            // while (ois.read() !=-1){
                Details de = (Details) ois.readObject();
                System.out.println(de.name + " , " + de.age);
            // }            
            // char [] content = new char[file.available()];
            // int i;
            // while (( i =file.read()) !=-1){
            //     System.out.print((char)i);
            // }

        } catch (Exception e) {
            e.printStackTrace();
        }
   } 
}

class Details implements Serializable{
    String name ;
    int age;
    Details(){}
    Details(String name , int age){
        this.name = name ;
        this.age= age;
    }
}
