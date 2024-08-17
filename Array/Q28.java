/*
   14/07/2024
   P is one-dimensional array of integers. Write a Java program search for a data VAL from P. If VAL is present in the array then “element found ” otherwise “element not found” should be displayed.
*/
class Q28 {
    public static void main(String args[]){
        int i,val=7, p[]={4,5,4,8,2,7};   
        boolean flag=false;
        for( i=0 ; i<p.length ; i++ )
            if(p[i]==val){
                flag = true;
                break;
            }
        if(flag)
            System.out.println("element found");
        else
            System.out.println("element NOT found");
    }
}