class P11{

    public static void main(String []args){

        double base=8,height=5,area=320;
        double temp=(1.0/2)*base*height;
        area=area/temp;
        area=Math.sqrt(area);
        base=area*base;
        height=area*height;
        System.out.println("base "+base+" "+"Height"+" "+height);
    }
}