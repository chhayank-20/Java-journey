// 1
// 01
// 101
// 0101
// 10101


public class A_62_13 {
    public static void main (String args[]){
    long startTime = System.currentTimeMillis();
        for(int i=1; i<6;i++){
            int j=i;
            while (j!=0) {
                if(j%2==0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
                j--;
            }
            System.out.println("");
        }
        
// Your code to be measured
    long endTime = System.currentTimeMillis();

    long  elapsedTime = endTime - startTime;

    System.out.println("Execution time in milliseconds: " + elapsedTime);

    }
}

