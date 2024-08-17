/*
    DATE : 10/06/2024

    Find common elements in three sorted arrays.

*/
class Q12
{
    public static void main(String args[])
    {
        
        int a[] = {1, 5, 10, 20, 40, 80};
        int b[] = {6, 7, 20, 80, 100};
        int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
        int i, j, k;
        for( i=0 ; i<b.length ; i++ )
        {
            for( j=0 ; j<a.length ; j++ )
            {
                if(b[i] == a[j])
                {
                    for( k=0 ; k<c.length ; k++ )
                    {   
                        if(b[i]==c[k])
                            System.out.print("Common Element : "+b[i]+"    ");
                    }
                }
            }
        }
    }
}