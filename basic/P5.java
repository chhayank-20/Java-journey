/*If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field. */
class P5{

    public static void main(String []args){

        double l=20;
        double b=(1600/25)/20.0;
        System.out.println("Breadth of rectangle "+b+"M");
        double per=2*(l+b);
        System.out.println("Parameter of rectangle "+per+"M");
        double area=l*b;
        System.out.println("Area of rectangle "+area+"M");
    }
}