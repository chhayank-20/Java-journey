// Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
// Only parameterized constructor;
// totalSalary always represent total of all the salaries of all employees created.
// empNo should be auto incremented.
// display total employees and totalSalary using class method.

class Employee{
    int empNo =0;
    private int salary ;
    public static int totalemp =0;
    public static int totalSalary =0;
    Employee( int salary ){
        empNo=empNo+1;
        this.salary=salary;
        totalSalary=salary+totalSalary;
        totalemp=totalemp+1;
    }
    public void display(int i){
        System.out.println("Salary "+i+" : "+salary);
        System.out.println("Total Salary of all Employees "+Employee.totalSalary);
        System.out.println("Total Employees  "+totalemp);
    }
}

public class A_17 {
    public static void main (String args []){
        
        Employee obj1=new Employee(36590);
        Employee obj2=new Employee(41030);
        Employee obj3=new Employee(30204);
        Employee obj4=new Employee( 60204);

        // System.out.println(obj1.salary);
        

        obj1.display(1);
        obj4.display(4);


    }
}