// Input name of a person and count how many vowels it contains. Use String class methods.

class vowel{
    vowel(String str){
        str=" "+str;
        char []ch=str.toLowerCase().toCharArray();
        // String result="";
        int count=0;
        for(int i=0; i<str.length();i++){
                if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ){
                    count++;
                }  
        }
        System.out.println("There are "+count+" words starting with a vowel");
    }
}

public class A_11 {
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter your name : ");

        String str =sc.nextLine();
        new vowel(str);
        sc.close();
    }
}
