

public class Person {
    private int age ;
    private String fname;
    private String lname;
    private double height;


    Person(String fname,String lname,int age,double height){
        this.age=age;
        this.height=height;
        this.lname=lname;
        this.fname=fname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return (" Eu sunt " + fname +" "+ lname + " am " + age + " ani si am  " + height + " metri ");
    }
}
