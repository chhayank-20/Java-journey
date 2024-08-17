/*
   14/07/2024
  Suppose X. Y, Z are arrays of integers of size M, N, and M + N respectively. The numbers in array X and Y appear in descending order. Write a java program to produce third array Z by merging arrays X and Y in descending order.
*/
class Q31 {
    public static void main(String args[]){
        int i, j, a[] = {15,13,9,6,3,1}, b[] = {15,12,7,3,1}, c[] = new int[a.length+b.length];
        for( i=0 ; i<a.length ; i++ )
            c[i] = a[i];
        for( j=b.length-1 ; j>=0 ; j--, i++ )
            c[i] = b[j];  
        for( i=0 ; i<c.length ; i++ ){
            for( j=i ; j<c.length ; j++ ){
                if(c[i]<c[j]){
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        for( i=0 ; i<c.length ; i++ )
            System.out.print(c[i]+" ");
    }
}