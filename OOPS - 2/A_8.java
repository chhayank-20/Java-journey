// 8) Create a class Student with two members : rollno and percentage.
// 	Create default and parameterized constructors. Create method show() to 	display information.
// 	Create another class CollegeStudent inherits Student class. Add a new membersemester to it. Create default and parameterized constructors. Also override show() method.
// 	Create another class SchoolStudent inherits Student class. Add a new memberclassname(eg 12 th ,10 th etc.) to it. Create default and parameterized 	constructors. Also override show() method.
// 	Create a class(say XYZ) with main method that carries out the operation of the project :
// has array to store objects of any class(Student or CollegeStudent, SchoolStudent).
// create two CollegeStudent and three SchoolStudent record objects and store 	them inside the array.
// display all record from the array.
// search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.
// count how many students are having A grade,if for A grade percentage >75.


class Student{
    int rollno;
    int percentage;
    static int count=0 ;
    Student(int rollno , int percentage){
        this.rollno=rollno;
        this.percentage=percentage;
        if (percentage>75) {
            count++;
        }
    }
    Student(String str){}
    void show(){
        System.out.println("Roll No.   : "+rollno);
        System.out.println("Percentage : "+percentage);
    }
    static void grade(){
        System.out.println(" Students having 'A' grade : "+ count);
    }
}

class CollegeStudent extends Student{
    int semester;
    CollegeStudent(int rollno , int percentage, int semester){
        super(  rollno , percentage);
        this.semester=semester;
        // new 
    }
    void show(){
        System.out.println("Roll No.   : "+rollno);
        System.out.println("Percentage : "+percentage);
        System.out.println("Semester   : "+semester);
        System.out.println();
    }
}

class SchoolStudent extends Student{
    int classname;
    SchoolStudent(int rollno, int percentage, int classname){
        super(rollno, percentage);
        this.classname=classname;
    }
    void show(){ 
        System.out.println("Roll No.   : "+rollno);
        System.out.println("Percentage : "+percentage);
        System.out.println("Class      : "+classname);
        System.out.println();
    }

}

public class A_8 {
    public static void main(String args[]){
        Student obj[] =new Student[5];
        obj[0]= new CollegeStudent(101, 78, 4);
        obj[1]= new CollegeStudent(102, 68, 6);
        obj[2]= new SchoolStudent(121, 77, 4);
        obj[3]= new SchoolStudent(123, 67, 5);
        obj[4]= new SchoolStudent(114, 87, 6);
        
        for (Student i : obj) {
            i.show();
        }
        Student.grade();

    }    
}
