import java.util.Scanner;
import java.util.Date;

class dMart{
    public static void main (String args[]){
        Date date=new Date();
        System.out.println("    Welcome to D_Mart   ");
        Scanner Sc_s = new Scanner(System.in);
        
        Scanner Sc_c = new Scanner(System.in);
        
        Scanner Sc_i = new Scanner(System.in);
        

        System.out.print("enter your name : ");
        String name=Sc_s.nextLine();
        System.out.print("Gender M or F : ");
        char gender=Sc_c.next().charAt(0);
        System.out.print("enter no. of items : ");
        int n =Sc_i.nextInt();

        int[] len;
        len= new int[n+1];
        int[] Qnt;
        Qnt = new int[n+1];
        double[] Price;
        Price = new double[n+1];
        double[] Total;
        Total=new double[n+1];
        double grandTotal=0;
        double[] discount;
        discount=new double[n+1];
        double GST;
        double finalDiscount=0;

        String[] item;
        item = new String[n+1];
        for(int z=1; z<=n; z++){
            System.out.println("              For Product "+z);
            System.out.print("Product "+z+" name : ");
            item[z]=Sc_s.nextLine();
            System.out.print("Product's Qnt : ");
            len[z] = item[z].length();
            Qnt[z] =Sc_i.nextInt();
            System.out.print("Products's Price: ");
            Price[z] =Sc_i.nextInt();
            
            Total[z]=(Price[z]*Qnt[z]);
            grandTotal=grandTotal+Total[z];
        }
        //discounts --
        if(Qnt[1]>4){
            discount[1] =Total[1]/20;
            Total[1]=Total[1]-(discount[1]);
            finalDiscount=finalDiscount+discount[1];
        }
        if(n>=5){
            discount[5] =Total[5]/10;
            Total[5]=Total[5]-(discount[5]);
            finalDiscount=finalDiscount+discount[5];
        }
        if(n>=10){
            discount[10] =(Total[10]*15)/100;
            Total[10]=Total[10]-(discount[10]);
            finalDiscount=finalDiscount+discount[10];
        }
        System.out.println("Do you need a carry bag ? ( Y or N) :");
        char bag=Sc_c.next().charAt(0);

        System.out.println("          \t\t\t  D MART \n");
        System.out.println(" Name : "+name+"\t\t\tDate : "+date);
        System.out.println(" --------------------------------------------------------------------------------------------- ");
        System.out.println("Item Name"+"\t"+"Quantity"+"\t"+"Price"+"\t\t"+" Total"+"\t\t\t"+"After-Discount");
        
        for(int z=1; z<=n; z++){
            if (len[z]>9){
            System.out.println(""+item[z] + "\t"+ Qnt[z]+"\t \t"+Price[z]+"\t  \t"+Total[z]+"\t\t\t"+discount[z]);
            // System.out.println("len :"+len[z]);
            }else{
            System.out.println(""+item[z] + "\t \t"+ Qnt[z]+"\t \t"+Price[z]+"\t  \t"+Total[z]+"\t\t\t"+discount[z]);    
            // System.out.println("len :"+len[z]);
            }
        }
        System.out.println(" --------------------------------------------------------------------------------------------- ");
        System.out.println("                                   \t         Actual Price  \t    Discount Price	 ");            
        System.out.println("\t\t\t\t\t\t"+grandTotal+"\t\t\t"+finalDiscount);
        
            if (gender =='f') {
                System.out.println(" Gift :- Cadeberry                 \t        0.00 \t              0.00 ");
            
            }else{
                System.out.println(" Gift :- Ladger Wallet                   \t        0.00\t    \t   \t0.00 ");
            }
            if (bag =='y'){
                System.out.println(" Carry Bag : Yes                     \t       10:00 \t              ");
                grandTotal=grandTotal+10;
            }else{
                System.out.println(" Carry Bag : No                                0:00\t  \t    \t ");
            }
        GST=grandTotal/10;
        grandTotal=grandTotal+GST;

        if(grandTotal>=10000){
            grandTotal=grandTotal-((grandTotal*15)/100);
        }
        if(grandTotal<10000 && grandTotal>=5000){
            grandTotal=grandTotal-(grandTotal/10);
        }
        System.out.println(" GST (10%)	\t  \t  \t  \t"+GST);         
        System.out.println(" --------------------------------------------------------------------------------------------- ");
        System.out.println("      Total                                      "+grandTotal);                                     
        System.out.println("\n\n\t\t\t\tThank  You \n\t\t\t\t To Vist \n\t\t\t\t  D-Mart \n\n");    

        Sc_c.close();
        Sc_s.close();  Sc_i.close();
    }
}