
import java.util.Stack;
public class stack_1 {
    public static void main(String[] args) {
        Stack<Object> s = new Stack<Object>();
        s.push("ajax");
        s.push("pool");
        s.push("tomorrow is near");

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.empty());
        System.out.println(s.isEmpty());

        //  it will give index of the element if it is present , otherwise it will give -1  
        System.out.println(s.search("pool"));
        s.pop();
        s.pop();
        System.out.println(s);
    }
}