// 1.Write a Java program to sort a numeric array and a string array.
// 2.Write a Java program to sum values of an array .
// 3.Write a Java program to calculate the average value of array element .
// 4.Write a Java program to test if an array contains a specific value .
// 5.Write a Java program to find the index of an array element .

import java.util.Arrays;

public class A_1 {
    public static void main(String[] args) {
        new arr();
    }    
}


class arr{
    int[] num= {2,5,9,5,3,1};
    String [] str = {"ajax" ,"person", "ok" , "900" }; 
    int sum =0 ,k=-1;
    String s1="ok";
    
    arr(){
        for(int i= 0 ; i<num.length; i++){
            System.out.print(num[i] + "  ");
            sum=sum+num[i];
        }
        Arrays.sort(num);
        System.out.println("\n\nSorted array : ");
        for(int i= 0 ; i<num.length; i++){
            System.out.print(num[i] + "  ");
        }

        System.out.println("\n");
        for(int i= 0 ; i<str.length; i++){
            System.out.print(str[i] + "  ");
            if (s1.equals(str[i])) {
                k=i;
            }
        }
        Arrays.sort(str);
        System.out.println("\n\nSorted array : ");
        for(int i= 0 ; i<str.length; i++){
            System.out.print(str[i] + "  ");
        }
        System.out.println("\n\n");
        if (k!=-1) {
            System.out.println(s1+" string found at index : "+k);
        }else{System.out.println(s1+" string not found.");}

        System.out.println("\n \n Sum of array is : " + sum);
        System.out.println("\n Average Sum of array is : " + sum/num.length);
        

    }

}