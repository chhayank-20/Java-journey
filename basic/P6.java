/*Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm.*/
class P6{

        public static void main(String []args){

            int a=10,b=9,per=36,c;
            c=per-a-b;
            double s=(a+b+c)/2;
            double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of tringle is "+area+"cm^2");

        }
}