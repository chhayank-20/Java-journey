public class rough {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=7;j>=1;j--){
                for(int k=j-i;k!=0;k--){
                    System.out.print(" ");
                }
                for(int k=j-2*i;k!=0;k--){
                    System.out.print("*");
                }
                for(int k=j-i;k!=0;k--){
                    System.out.print(" ");
                }
                System.out.println("");
            }
            
        }
    }   
}
