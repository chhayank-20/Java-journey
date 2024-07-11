
class max {
    max(String str){
        char []ch=str.toCharArray();
        int count=0;
        int max=0;
        String result="";
        String s="";
        
        for(int i=0;i<str.length();i++){
            if(ch[i]!=' '){
                count++;
                result =result+ch[i];    
            }
            
            if(ch[i]==' '){
                count=0;
                result="";
            }

            if(count >max){
                max=count;
                s=result;    
            }
        }
        System.out.println(max+" "+s);
    }
}

public class A_9 {
    public static void main(String args[] ){
        new max("abc axad 123456");
    }
}
