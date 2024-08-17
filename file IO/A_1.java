// Que. 1 Write a java program to read/write data into the file.(Use File Output Stream, File Input
// Stream).

import java.io.FileOutputStream;
import java.io.FileInputStream;
// import java.io.*;

class A_1{
    public static void main(String[] args) {
        String name="test1.txt";
        String str= " hii, its chhayank , and this file is created by me .";

        try{
        FileOutputStream file = new FileOutputStream(name,true);
        byte b[]=name.getBytes();
        file.write(b);
        file.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        try{
            FileInputStream file = new FileInputStream(name);
            // System.out.println();
            char [] content = new char[file.available()];
            int i;
            while (( i =file.read()) !=-1){
                System.out.print((char)i);
            }
            file.close();
        }catch(Exception e){e.printStackTrace();}

        try{
            FileOutputStream file = new FileOutputStream(name,true);
            file.write(str.getBytes());
            file.close();
        }catch(Exception e){e.printStackTrace();}

    }
}