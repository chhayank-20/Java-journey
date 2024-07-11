public class array_sum {

        public static void main (String args[]){

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
