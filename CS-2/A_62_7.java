// 1
// 00
// 111
// 0000
// 11111


public class A_62_7 {
    public static void main (String args[]){

    for(int i=0; i<6; i++){
        // for(int j= 0; j<2; j++){ 
            System.out.println(" ");
            
            for(int j= 0; j<i; j++){
            if (i%2==0){
                System.out.print("0");
            }else{
                System.out.print("1")  ;
            }
            }
        // } 
    }   
}    
}
