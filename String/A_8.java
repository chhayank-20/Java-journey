// WAP to find out total occurrence of each letter in string.
// Sample Input: aabbccddd
// 	 Output:   a- 2 times
// 			b- 2 times
// 			c- 2 times
// 			d- 3 times

abstract class A { 
    private String b; 
    public abstract void occur(String str); 
    void value (String ba){
        this.b =ba;
    }
    String get(){
        String d=b;
    return d;
    }   
}

class Occurrence extends A {
    public void occur(String str) {
        char []ch=str.toCharArray();
        int count =0;
        char c=ch[0];
        for(int i=0; i<str.length();i++){
            if(c!=ch[i]){
                System.out.println("occurance of "+ch[i-1]+" : "+count );
                count=0;
                c=ch[i];
            }count++;
            
        }  System.out.println("occurance of "+ch[str.length()-1]+" : "+count );      
    }
}

public class A_8 {
    public static void main(String[] args) {
        Occurrence obj = new Occurrence();
        String str = "aabbccccdddsssf";

        obj.value(str);
        System.out.println(obj.get());
        obj.occur(str);
    }
}

