// aaabbbacccababacccaabb
public class A_6 {
    public static void main (String args[]){

        // System.out.println("Enter String :" );
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        // String str = sc.nextLine();
        // new palindrom(str+"  ");
        new palindrom("aaabbbacccababacccaabb");
        // sc.close();    

    }
}

class palindrom{
    String result="";
    String rev="";
    String str;

    palindrom(String str)
    {
        char[] ch= str.toCharArray();

        for(int i=0;i<str.length();i++){
        for(int j=i+1;j<str.length();j++){
            if(ch[j]!=' '){
                result=result+ch[j];
                rev=ch[j]+rev;
                if(result.equals(rev)){
                    System.out.println("Palindrom Found : "+rev);
                    
                }
            }
        }
            result="";
            rev="";
        }
        
    }
}
