
class conversion{
    conversion(String str) {
        str = str.replace(',',' ');
        String[] num = str.split("  "); 
        for(String n :num){
            try {
            int number = Integer.parseInt(n);
            System.out.print(" "+number);
              } catch (NumberFormatException e) {}
        }
      }
}

// blade runner , kniver out , gangster Squard

public class A_12 {
    public static void main(String args[]){
        new conversion("  89, 23, 67, 12, 55, 66");
    }
}
