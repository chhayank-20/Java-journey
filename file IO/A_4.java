// Que. 4 Write a program to count how many times character ‘t’ occurs in a file.
import java.io.*;

public class A_4 {
    public static void main(String[] args) {
        String name = "test3.txt";
        String content = "the fox and the crow";
        try {
        FileOutputStream file = new FileOutputStream(name); 
        byte [] b = content.getBytes();
        file.write(b);
        file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
            FileInputStream file = new FileInputStream(name);
            // System.out.println();
            char [] data = new char[file.available()];
            int i;
            int count=0;
            while (( i =file.read()) !=-1){
                // System.out.print((char)i);
                if((char)i.equals()){count++;}
            }
            file.close();
        }catch(Exception e){e.printStackTrace();}

    }
}
