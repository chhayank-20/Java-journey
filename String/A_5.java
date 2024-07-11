
class reverse{

    public static void Reverse(String str){
    
        String result=" ";
        char ch[]=str.toCharArray();
        for(int i=0; i<str.length(); i++){
            
            if (ch[i]!=' '){
                result=ch[i]+result;
            }else if (ch[i]==' ') {
                System.out.print(result+"");
                result="";
            }

        }

    }
}

public class A_5{
    public static void main (String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        sc.close();
        reverse.Reverse(str+" ");
    }
}