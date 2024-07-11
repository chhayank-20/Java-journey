class A_2{
    public static void main (String args[]){

        int array[][]={
        {5 , 4 , 3},
        {2 , 6 , 8},
        {1 , 3,  4}
        };

        int even=0, odd=0;
        int m=0,n=0;

        for(m=0; m<array.length; m++){
            for(n=0; n<array[m].length;n++){
                if(array[m][n]%2==0){
                    even=even+array[m][n];
                }else{
                odd=odd+array[m][n];  
                }  
            }
        }
        System.out.println("\nsum of even no. is : "+even);
        System.out.println("\nsum of odd no. is : "+odd);
        System.out.println("\n");
        
    }
}