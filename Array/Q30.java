/*
   14/07/2024
  Suppose A, B, C are arrays of integers of size M, N, and M + N respectively. The numbers in array A appear in ascending order while the numbers in array B appear in descending order. Write a java progtam to produce third array C by merging arrays A and B in ascending order.
*/
class Q30 {
    public static void main(String args[]){
        int i, j, a[] = {1,3,4,6,8,9,15}, b[] = {25,20,17,11,9,8,3}, c[] = new int[a.length+b.length];
        for( i=0 ; i<a.length ; i++ )
            c[i] = a[i];
        for( j=b.length-1 ; j>=0 ; j--, i++ )
            c[i] = b[j];  
        for( i=0 ; i<c.length ; i++ ){
            for( j=i ; j<c.length ; j++ ){
                if(c[i]>c[j]){
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