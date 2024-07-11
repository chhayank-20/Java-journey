// import java.util.Scanner;
class A_1{
    public static void main (String args[]){
        // Scanner sc=new Scanner(System.in);

        // System.out.println("Enter Rows for array : ");
        // int m=sc.nextInt();
        // System.out.println("Enter Coloumns : ");
        // int n=sc.nextInt();

        // int arr[][]=new int[m][n];

        // for(m=0; m<arr.length; m++){
        //     System.out.println("Enter element of array "+(m+1) +" : " );
        //     for(n=0; n<arr[m].length;n++){
        //     arr[m][n]=sc.nextInt();
        //     }
        //     System.out.println("");
        // }

        // System.out.println("Given 2D array is : ");
        // for(m=0; m<arr.length; m++){
        //     for(n=0; n<arr[m].length;n++){
        //     System.out.print(arr[m][n]+"  ");
        //     }
        //     System.out.println("");
        // }

        int array[][]={
        {5 , 4 , 3},
        {2 , 6 , 8},
        {1 , 3,  4}
        };

        int sum=0;
        int m=0,n=0;

        for(m=0; m<array.length; m++){
            for(n=0; n<array[m].length;n++){
            sum=sum+array[m][n];
            }     
        }
        System.out.println("sum is : "+sum);
        System.out.println("\n");
    }
}