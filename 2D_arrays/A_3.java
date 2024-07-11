// sum of diagonal of array
class A_3{
    public static void main (String args[]){

// { 00 , 01 , 02 }
// { 10 , 11 , 12 }
// { 20 , 21 , 22 }

        int array[][]={
        {1 , 5 , 4},
        {6 , 8 , 9},
        {3 , 2,  7}
        };

        int l_diagonal=0, r_diagonal=0;
        int m=0,n=0;

        for(m=0; m<array.length; m++){
            for(n=0; n<array[m].length;n++){
                if(m==n){
                    l_diagonal=l_diagonal+array[m][n];
                }if(m+n==2){
                    r_diagonal=r_diagonal+array[m][n];  
                }  
            }
        }
        System.out.println("\nsum of left-diagonal no. is : "+l_diagonal);
        System.out.println("\nsum of Right-diagonal no. is : "+r_diagonal);
        System.out.println("\n");
        
    }
}