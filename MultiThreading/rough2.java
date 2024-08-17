public class rough2 {
    public static void main (String str[]){
        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
                // if((j/2==3) || (i==1 || j==2|| j==4) || (i==2 || j==1|| j==5) || (i==3 || j==0|| j==6) ){
                //     System.out.print(" *");
                // }
                if(j/2==3){
                    System.out.print(" *");
                }
            
                if(i==1 && (j==2 || j==4)){
                    System.out.print(" *");
                }
                if(i==2 && (j==1 || j==5 || j==2 || j==4)){
                    System.out.print(" *");
                }
                // if(i==3 && (j==0 || j==6)){
                //     System.out.print(" *");
                // }
                if(i==3){
                    System.out.print(" *");
                }
                else{
                    System.out.print(" ");
                }   
            // }
            }
            System.out.println("");
        }
    }
}
