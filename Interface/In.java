
interface RBI{
    public int getRateOfInterest();
}

class SBI implements RBI{
    public int getRateOfInterest(){
        return 8;
    }
}

class HDFC implements RBI{
    public int getRateOfInterest(){
        return 9;
    }
}

class ICICI implements RBI{
    public int getRateOfInterest(){
        return 10;
    }
}

public class In {
    public static void main(String args[]){
        RBI obj;
        obj =new HDFC();
        System.out.println(obj.getRateOfInterest());
        obj =new SBI();
        System.out.println(obj.getRateOfInterest());
        obj =new ICICI();
        System.out.println(obj.getRateOfInterest());

    }
    
}
