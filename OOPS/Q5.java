/*
Create a class Person with properties (name and age) with following features.
Default age of person should be 18.
A person object can be initialized with name and age.
Method to display name and age of person.
 */

class Person{

    private int age = 18;
    private String name;

    public void setData(String name){

        this.name = name;
    }
    public void display(){

        System.out.println("name is "+name);
        System.out.println("age  "+age);
    }
}
class Q5{

    public static void main(String []args){

        Person obj = new Person();
        obj.setData("Shivam");
        obj.display();
    }
}