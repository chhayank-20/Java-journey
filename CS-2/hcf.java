//hcf 

import java.util.Scanner;
class hcf{
    public static void main (String args[]){
        Scanner sc= new Scanner (System .in );
        System.out.print("Enter the no. of values you wana give : ");
        int num = sc.nextInt();

        int[] n;
        n = new int[num];
        int[][] f;
        f=new int[num][10];

        // int a=0;
        // while (a!=num) { 
        //     int[] f[a];
        //     f[a] = new int[10];
        // }

        int a=0;
        while (a!=num) { 
            System.out.print("Enter the numbers : ");
            n[a] = sc.nextInt();
            a++;
        }

        a=0; 
        while (a!=num) { 
            System.out.print(" "+ n[a]);
            // n[a] = sc.nextInt();
            // num--;
            a++;
        }
        

        // num1 = 5, num2 = 10, num3 = 25;

        for( a=0; a<n[1] ; a++){

            for(int j=1; j<n[a]; j++){
                if (n[a]%j==0){
                    f[a][j]=j; }
                else{
                    f[a][j]=1; }
                
            }
        }

        for( a=0; a<n[1] ; a++){

            for(int j=1; j<n[a]; j++){
                System.out.print(" "+ f[a][j]);
                
            }
        }
        // if (f[a][j]==f[][]) {
        // }


        sc.close();
    }
}
