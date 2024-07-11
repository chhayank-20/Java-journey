// transpose an array
class A_5{
    public static void main (String args[]){
// { 00 , 01 , 02 }          { 00 , 10 , 20 }
// { 10 , 11 , 12 }          { 01 , 11 , 21 }
// { 20 , 21 , 22 }          { 02 , 12 , 22 }
        int array[][]={
        {6 , 2 , 1},
        {8 , 9 , 4},
        {3 , 11, 7}
        };
 
        int m=0,n=0; 

        for(m=0; m<array.length; m++){
            for(n=0; n<array[m].length;n++){
                System.out.print(array[n][m]+"  ");

            }
            System.out.println("");
        }
 
    }
}