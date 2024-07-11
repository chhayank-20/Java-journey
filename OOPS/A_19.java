// Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].

class Students{
    private String name;
    private int score;
    private int rollNo;
    public int age;
    public int totalscore;
    Students (String name , int score , int rollNo, int age){
        this.rollNo=rollNo;
        this.score = score;
        this.name=name;
        this.age=age;
    }
}

public class A_19 {
    public static void main (String...x){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        boolean a=true;
        Students obj[] =new Students[10];
        int i=0;
        while ( a=true) {
            
            System.out.println("Enter Students name :");
            sc.next();
            String name = sc.nextLine();
            System.out.println("Enter Students Roll NO. :");
            int rollNo = sc.nextInt();
            System.out.println("Enter Students score :");
            int score = sc.nextInt();
            if (score>100) {
                System.out.println("Enter correct Score");
                score = sc.nextInt();            
            }
            if (score>80 && score <100) {
                
            }
            System.out.println("Enter Students age :");
            int age = sc.nextInt();
            
            obj[i]= new Students ( name , score , rollNo, age);
            i++;

            System.out.println("wana add more Studentss Y / N :");
            char  r  = sc.next().charAt(0);
            if(r=='n'||r=='N'){
                a=false;
                break;
            }
        }

        int totalAmmount=0;
        for(int k =0 ; k<i;k++){
            totalAmmount =totalAmmount+obj[k].totalscore;
        }
        System.out.println("Total Ammount spent : "+totalAmmount);

    }
}

