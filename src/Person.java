

public class Person {
    int age ;
    String fname;
    String lname;
    double height;

    Person(int age, String fname){
        this.age=age;
        this.fname=fname;
    }

    Person(int age,double height,String lname, String fname){
        this.age=age;
        this.height=height;
        this.lname=lname;
        this.fname=fname;
    }

    public String toString() {
        return (" Eu sunt " + this.fname + " si am " + this.age + " ani. ");
    }
}
