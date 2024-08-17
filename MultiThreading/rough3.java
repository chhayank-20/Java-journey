public class rough3 {
    
// class HelloWorld {
    public static void main(String[] args) {
        for(int row = 0; row<4 ;row++){
            for (int col=0; col<7; col++){
                // System.out.print(row+""+col);
                
                if (col==3){System.out.print(".");}
                
                if (row>0 && (col==2 || col== 4)){System.out.print(".");}
                
                if (row>1 && (col==1 || col== 5)){System.out.print(".");
                }
                
                if (row>2 && (col==0 || col== 6)){
                    System.out.print(".");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }   
    }
// }
}
