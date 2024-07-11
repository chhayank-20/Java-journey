class P12{

    public static void main(String []args){

        double hy=13,side1=12,side2,area;
        side2=Math.sqrt(hy*hy-side1*side1);
        area=(side1*side2)/2.0;
        System.out.println("Length is "+side2+" "+"area "+area);
    }
}