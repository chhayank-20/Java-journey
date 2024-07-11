// 7) Create three classes  Faculty  (facultyid, salary), FullTimeFaculty  (basic, allowance) inherits class Faculty, PartTimeFaculty  (hour, rate) inherits class Faculty. 
//  Create   a   method   for   accepting   input   in   FullTimeFaculty       and  PartTimeFaculty,  but   salary  should   not   be   accepted.    salary   is  calculated   on   the   basis   of   (basic+allowance)   for   FullTimeFaculty   and  (hour*rate)   for   PartTimeFaculty.   Also   create   method   in   above   classes   to  display faculty data. 
//  Create   another   class(say   XYZ)   for   main   method   and   store   2 fulltime and 2 parttime faculty information. Also print their details. 

class Faculty{
    public int salary;
    public String name;
}

class PartTimeFaculty extends Faculty{
    public int basic ;
    public int allowance;
    PartTimeFaculty(String name, int allowance, int basic){
        this.name=name;
        this.allowance=allowance;
        this.basic=basic;
        salary=allowance+basic;
    }

    PartTimeFaculty(PartTimeFaculty obj){
        System.out.println("Name : "+obj.name + ",  Salary : "+ obj.salary);
    }
}

class FullTimeFaculty extends Faculty {
    public int rate ;
    public int hour;
    FullTimeFaculty(String name, int hour , int rate){
        this.name=name;
        this.hour=hour;
        this.rate=rate;
        salary = hour *rate;
    }

    FullTimeFaculty(FullTimeFaculty obj){
        System.out.println("Name : "+obj.name + ",  Salary : "+ obj.salary);
    }
}

public class A_7 {
    public static void main(String args[]){
        PartTimeFaculty obj =new PartTimeFaculty("Ajax", 50000 ,2500);
        new PartTimeFaculty(obj);
        PartTimeFaculty obj2 = new PartTimeFaculty("Pool", 35000 ,1250);
        new PartTimeFaculty(obj2);

        FullTimeFaculty obj3 =new FullTimeFaculty("yu", 270 ,1000);
        new FullTimeFaculty(obj3);
        FullTimeFaculty obj4 =new FullTimeFaculty("zan", 135 ,4250);
        new FullTimeFaculty(obj4);
    }
} 
