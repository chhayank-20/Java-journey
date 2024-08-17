// package Demo;

@FunctionalInterface interface I{
    void show (int a );
}

@FunctionalInterface interface B{
    void test (int a );
}

class A  {
    static void show(int a){
        System.out.println("class A , method show with value : "+a);
    }
    void test(int b){
        System.out.println("method : Test with value :"+b);
    }
}

public class lambdaExpresion {
    public static void main(String args[]){
        I obj2 = a -> System.out.println(a);
        obj2.show(4);

    // with static method 
        I obj = A::show;
        obj.show(7);
    // without static method (with object)
        A obj3 = new A();
        B obj4 = obj3::test;
        obj4.test(5);
    }
}
