// sort a 2D array 

// import java.util.Arrays;
public class A_6 {
    public static void main (String args[]){
        // { 00 , 01 , 02 }          
        // { 10 , 11 , 12 }          
        // { 20 , 21 , 22 }           
                int array[][]={
                {6 , 2 , 1},
                {8 , 9 , 4},
                {3 , 11, 7}
                };
                 
                // for(int[] element : array){
                //     Arrays.sort(element);
                //     for(int i=0; i<element.length;i++){
                //         System.out.print(element[i]+"  ");
                //     }
                //     System.out.println("");
                // }

                int temp,j=0;
                for(int i=0;i<array.length;i++) {
                for(int k=0; k<array.length;k++){
                    for( j=0;j<array[i].length-1;j++  ){

                        if (array[i][j]>array[i][j+1]) {
                            temp=array[i][j+1];
                            array[i][j+1]=array[i][j];
                            array[i][j]=temp;                             
                        System.out.print(array[i][j]+"  ");  
                         
                        }
                    }
                }
                }
                
            
                System.out.println( " \n\n ");
                for( int i=0; i<array.length;i++){
                    for(j=0;j<array[i].length; j++){
                        System.out.print(array[i][j]+"  ");
                    }
                    System.out.println( "  ");
                }  
                System.out.println( " \n ");          
    }
}
