

public class MainClass {

    public static void main(String[] arg) {

        Person Violina = new Person(20, "Violina");
        Person Eduard = new Person(23, 1.56, "Grey", "John");
        Violina.age=21;

        System.out.println(" Eu ma numesc " + Violina.fname + " si am " + Violina.age + " de ani. ");
        System.out.println(" Prietenul meu il cheama " + Eduard.fname + " " + Eduard.lname + " , are " + Eduard.age + " ani  si inaltimea " + Eduard.height + " metri. ");

        System.out.println(Violina);
        System.out.println(Eduard);

        Arbore Cires = new Arbore("Brad", 45, 34);
        Arbore Tei = new Arbore("Stejar", 55, 32);
        System.out.println(" Eu am un arbore cu denumirea " + Cires.getName() + " cu " + Cires.getFrunze() + " frunze si " + Cires.getRamuri()+ " de ramuri. ");
        System.out.println(" Eu am un arbore cu denumirea " + Tei.getName() + " cu " + Tei.getFrunze() + " frunze si " + Tei.getRamuri()+ " de ramuri. ");


        Cires.setName("Prune");
        Cires.setFrunze(44);
        Cires.setRamuri(22);

        Tei.setName(" Artar ");
        Tei.setFrunze(24);
        Tei.setRamuri(46);

        System.out.println(Cires);
        System.out.println(Tei);

        Student Jack = new Student( 44, "Lorena");
        System.out.println(Jack);

        Student Eugen=new Student(56, 1.70,"Brudici", "Eugen",7.88) ;
        System.out.println(Eugen);
        System.out.println( Eugen.getMedie() );
        System.out.println( Eugen.getLname());


        MyNootebook Hp= new MyNootebook("hp",1600,35,"blue",5000);
        MyNootebook Samsung =new MyNootebook(9000,1700,"black","Samsung");

        Hp.setName("Lenova");
        Samsung.setColor("red");
        Hp.setColor("orange");

        System.out.println(Hp);
        System.out.println(Samsung);

        MyTelephone MI_A2= new MyTelephone("MI_A2",2000,40," albastru ",5000,"Redmi");

        System.out.println(MI_A2);

        My_wardrobe Modern =new My_wardrobe(44, 21);

    }
}


