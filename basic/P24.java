class P24{

    public static void main(String []args){

        double l,b,h,v1,v2,rate,cost,n;
        l=25;
        b=10;
        h=7.5;
        rate=900;
        v1=l*b*h;
        l=20;
        b=2;
        h=0.75;
        v2=l*b*h;
        n=(v2*1000000)/v1;
        cost=(n/1000)*rate;
        System.out.println("Number = "+n+" "+"cost = "+cost);
    }
}