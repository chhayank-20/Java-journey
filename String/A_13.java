// WAP check if two Strings are anagrams of each other?
// (Hint Anagram words: LISTEN - SILENT 
// 				  TRIANGLE - INTEGRAL)


class Anagram{
    Anagram(String s1,String s2 ){
        char [] ch=s2.toCharArray();
        String str="";
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                if(s1.equals(s2)){
                    System.out.println("It's an Amagram");
                    break;
                }else{
                    s1=s1.replace(ch[i], ' ');
                    str=" "+str;
                }
            }
            if(s1.equals(str)){
                System.out.println("It's an Amagram");
            }else{
                System.out.println("Not an Amagram");
            }
        }else{
            System.out.println("Not an Amagram.");
        }
    }
}

public class A_13 {
    public static void main(String args[]){
        System.out.println("Enter string 1 : ");
        java.util.Scanner sc = new java.util.Scanner(System.in);

        String s1=sc.nextLine();
        System.out.println("Enter string 2 : ");
        String s2=sc.nextLine();

        new Anagram(s1, s2);
        sc.close();
    }
}
