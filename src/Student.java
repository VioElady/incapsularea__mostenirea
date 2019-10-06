

public class Student extends Person {
    private double medie;

    Student(int Age, String Fname){
        super(Age, Fname);

    }

    Student(int Age,double Height,String Lname, String Fname,double medie){
        super( Age, Height,Lname,Fname );

        this.medie=medie;
    }

    public double getMedie() {
        return medie;
    }

   public String getLname(){
        return super.lname;
   }
}


