

public class MainClass {

    public static void main(String[] arg) {

        Person violina = new Person("Violina", "Eladii",20,1.66);
        Person eduard = new Person( "Eduard", "Grey",23,1.77);
        Student katy = new Student("Katy", "Lary",21,1.65,8.77);

        System.out.println(violina);
        System.out.println(eduard);
        System.out.println(katy);


        Arbore stejar = new Arbore("Stejar", 45, 34);
        Arbore salcam = new Arbore("Salcam", 55, 32);
        Pom_fructifer cires = new Pom_fructifer("Cires",34,22,24);

        System.out.println(stejar);
        System.out.println(salcam);
        System.out.println(cires);


        MyDevice hp= new MyDevice("hp",3000,12,"rosie",5056 );
        MyDevice samsung =new MyDevice("samsung",5000,44,"negru",10077);
        MyTelephone mI_A2= new MyTelephone("MI_A2",2000,40," albastru ",5088," Redmi "," mate_34 ");

        System.out.println(hp);
        System.out.println(samsung);
        System.out.println(mI_A2);


    }
}


