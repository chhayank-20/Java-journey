// WAP to count the word whose first letter is  vowel.

class vowel{
    vowel(String str){
        str=" "+str;
        char []ch=str.toLowerCase().toCharArray();
        // String result="";
        int count=0;
        for(int i=0; i<str.length();i++){
            if(ch[i]==' '){
                if(ch[i+1]=='a' || ch[i+1]=='e' || ch[i+1]=='i' || ch[i+1]=='o' || ch[i+1]=='u' ){
                    count++;
                }
            }   
        }
        System.out.println("There are "+count+" words starting with a vowel");

    }
}

public class A_10 {
    public static void main(String args[]){
        new vowel("abds Abs shkja hsdhk ew hfeso weu wi fo ooo");
    }
}
