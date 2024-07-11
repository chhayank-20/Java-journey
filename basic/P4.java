/*. Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m */
class P4{

    public static void main(String []args){

        double l=300,w=150;
        double area=l*w;
        double total_cost=area/100*6;
        System.out.print("Total cost of tiling "+total_cost+"$");
    }
}