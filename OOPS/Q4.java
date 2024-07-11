/*
Create a class MathOperation containing method ‘multiply’ to calculate multiplication of following arguments.
two integers
three float
all elements of array
one double and one integer
 */

class MathOperation{

   public int multiply(int a,int b){

       int r = (a*b);
        return r;
   }
   public float multiply(float a,float b,float c){

       float r = a*b*c;
        return r;
   }
   public int multiply(int arr[]){

        int r = 1;
        for(int i = 0 ;i < arr.length;i++)
             r = r*arr[i];

        return r;
   }
   public double multiply(double a,int b){

        double r = a*b;
        return r;
   }
}
class Q4{

    public static void main(String[] args){

        MathOperation obj = new MathOperation();

        int arr[] = {2,3,4,5,6,7};

        System.out.println("Two integers : "+obj.multiply(2,3));
        System.out.println("Thre float : "+obj.multiply(2.3f,3f,4f));
        System.out.println("Array : "+obj.multiply(arr));
        System.out.println("One double One integer : "+obj.multiply(2d,3));
    }
}