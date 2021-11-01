//  Create a Teacher class and derive Professor/Associate_Professor/Assistant_Professor class from Teacher class.
//  Define appropriate constructor for all the classes.
//  Also define a method to display information of Teacher.
//  Make necessary assumptions as required.

class teacher{
    String name;
    int id;

    teacher(){
        name = "NULL";
        id = 0;
    }

    void display() {
        System.out.println(" Name : " + name + "\n ID : " + id);
    }
}

class professor extends teacher{
    int year;
    int basic;

    professor() {
        year = 0;
        basic = 0;
    }

    void display1() {
        System.out.println( " Name : " + name + "\n ID : " + id + "\n Year : " + year + "\n Basic : " + basic + "\n--------------------");
    }
}

class associate_professor extends teacher{
    int year;
    int basic;

    associate_professor() {
        year = 0;
        basic = 0;
    }

    void display2() {
        System.out.println(" Year : " + year + "\n Basic : " + basic + "\n--------------------");
    }
}
class assistant_professor extends teacher{
    int year;
    int basic;

    assistant_professor() {
        year = 0;
        basic = 0;
    }

    void display3() {
        this.display();
        System.out.println(" Year : " + year + "\n Basic : " + basic + "\n--------------------");
    }
}

public class exp7 {
    public static void main(String[] args) {
        teacher superOB = new teacher();
        professor P = new professor();
        associate_professor  AP = new associate_professor();
        assistant_professor ASP = new assistant_professor();

        superOB.name = "PRINCIPLE";
        superOB.id = 0;
        superOB.display();
        System.out.println("--------------------");

        P.name = "Nikhil";
        P.id = 2;
        P.year = 2000;
        P.basic = 90000;
        //P.display();
        P.display1();

        AP.name = "Mukesh";
        AP.id = 5;
        AP.year = 2005;
        AP.basic = 75000;
        AP.display();
        AP.display2();

        ASP.name = "Omkar";
        ASP.id = 10;
        ASP.year = 2010;
        ASP.basic = 50000;
        //ASP.display();
        ASP.display3();
    }
}
