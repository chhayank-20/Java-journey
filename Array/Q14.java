/*
    DATE : 11/06/2024

    Find the first non-repeating element in a given array arr of N integers.
    Note: Array consists of only positive and negative integers and not zero.

*/
import java.util.Scanner;
class Q14
{
    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int i, j, count=0, a[] = new int[size];
        boolean flag ;

        System.out.println("Enter the elements of array : ");
        for( i=0 ; i<a.length ; i++ )
            a[i] = sc.nextInt();

        for( i=0 ; i<a.length ; i++ )
        {
            for( j=0 ,flag=true ; j<a.length ; j++ )
            {
                if(i==j)
                    j++;
                if(a[i] == a[j])
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {   
                System.out.println("First non-repeating element : "+a[i]);
                count++;
                break;
            }
        }
        if(count==0)
            System.out.println("No element is non-repeating element ");
    }
}