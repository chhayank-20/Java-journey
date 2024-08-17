/*
   14/07/2024
    Given two arrays of integers A and B of sizes M and N respectively. Write a Write a c program, which will produce a third array named C. such that the following sequence is followed. 
    All even numbers of A from left to right are copied into C from left to right. 
    All odd numbers of A from left to right are copied into C from right to left. 
    All even numbers of B from left to right are copied into C from left to right. 
    All old numbers of B from left to right are copied into C from right to left.
    e.g., A is {3, 2, 1, 7, 6, 3} and B is {9, 3, 5, 6, 2, 8, 10} the resultant array C is {2, 6, 6, 2, 8, 10, 5, 3, 9, 3, 7, 1, 3} 
*/
class Q32 {
    public static void main(String args[]){
        int i, j, evenNum=0, p=0,a[]={3, 2, 1, 7, 6, 3}, b[]={9, 3, 5, 6, 2, 8, 10}, c[] = new int[a.length+b.length];
        for( i=0 ; i<a.length ; i++ )
            if(a[i]%2==0){
                c[p++]=a[i];
                evenNum++;
            }
        for( i=0 ; i<b.length ; i++ )
                if(b[i]%2==0){
                    c[p++]=b[i];
                    evenNum++;
                }
        p=c.length-1;
        for( i=0 ; i<a.length ; i++ )
            if(a[i]%2==1)
                c[p--]=a[i];
        for( i=0 ; i<b.length ; i++ )
            if(b[i]%2==1)
                c[p--]=b[i];
        for( i=0 ; i<c.length ; i++ )
            System.out.print(c[i]+" ");
    }
}