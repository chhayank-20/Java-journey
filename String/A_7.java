
class duplicate{
    String str ;
    duplicate(String str){
        this.str=str;
        char [] ch =new char[str.length()];
        ch=str.toCharArray();

        for (int i=0; i<str.length()-1;i++){
            if(ch[i]!=ch[i+1]){
                System.out.print(" "+ ch[i]);
            }
        }
        System.out.print(" "+ch[str.length()-1]);

    }
}

public class A_7 {
public static void main (String args[]){

    System.out.println("Enter String :" );
    java.util.Scanner sc = new java.util.Scanner(System.in);
    String str = sc.nextLine();
    new duplicate(str);
    sc.close();

}
    
}