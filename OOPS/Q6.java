/*
Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
Only parameterized constructor;
totalSalary always represent total of all the salaries of all employees created.
empNo should be auto incremented.
display total employees and totalSalary using class method.
*/
class Employee{

    private int empno;
    private int[] salary;
    private int totalsalary;

    public Employee(int... salary){
        this.salary = salary;
        for(int element: salary)
        {
            totalsalary += element;
            empno++;
        }
    }
        

    public void display(){

            System.out.println("Total employees "+empno);
            System.out.println("Total salary "+totalsalary);
    }
 
}
class Q6{

    public static void main(String[] args){
        Employee obj = new Employee(30000,32000,43000,76000,50000);
       
        obj.display();
    }
}