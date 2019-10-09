

public class Student extends Person {
    private double medie;

    Student(String Fname,String Lname,int Age,double Height,double medie){
        super(Fname,Lname,Age,Height);
        this.medie=medie;
    }

    public double getMedie() {
        return medie;
   }

    public void setMedie(double medie) {
        this.medie = medie;
    }

    @Override
    public String toString() {
        return  (" Pe prietena mea o cheama " + getFname()+ " " + getLname() + " , are " + getAge() + " ani  inaltimea de " + getHeight() + " metri si "+ "media =" + medie );
    }
}


