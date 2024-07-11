// to calculate sum of left down triangle of a 2Darray
public class A_4 {
    public static void main (String args[]){

        int array[][]={
        {6 , 4 , 2},
        {2 , 3 , 8},
        {9 , 7,  1}
        };

        int tSum_l=0, tSum_r=0;
        int m=0,n=0;

        for(m=0; m<array.length; m++){
            for(n=0; n<array[m].length;n++){
                if(m>n){
                    tSum_l=tSum_l+array[m][n];
                }if(m<n){
                    tSum_r=tSum_r+array[m][n];
                }  
            }
        }
        System.out.println("\nsum of Left down triangle of array is : "+tSum_l);
        System.out.println("\nsum of right up triangle of array is : "+tSum_r);
        System.out.println("\n");
        
    }
}
