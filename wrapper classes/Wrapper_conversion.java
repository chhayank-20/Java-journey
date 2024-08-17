public class Wrapper_conversion {
    public static void main (String args[]){
        // conversion octadecimal to integer
        Integer i = Integer.valueOf("273", 8);
        System.out.println("In octadecimal 273 is : "+i);

        // corversion binary to integer
        Integer i1 = Integer.valueOf("1", 2);
        System.out.println("In binary 1 is : "+i1);

        // conversion hexadecimal to integer
        Integer i2 = Integer.valueOf("199", 16);
        System.out.println("In hexa-decimal 199 is : "+i2);

        Integer i4= Integer.valueOf(12);
        System.out.println(Integer.toBinaryString(i4));
    }
}
