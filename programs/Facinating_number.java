// to find wether a number is Facinating number or not ?

import java.util.Scanner;
public class Facinating_number {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int m,rem , sum=45 ,count=0 ;
        sc.close();
        for(int i=1;i<4;i++){
            m=i*num;
            while(m!=0){
                rem=m%10;
                sum=sum-rem;
                if(rem==0){count--;}
                count++;
                m=m/10;
            }
        }
        if(sum==0 && count==9){System.out.println("it's a facinatng number");}
        else{System.out.println("Not a facinatng number");}
    }
}
