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

    }
}

class professor extends teacher{
    int year;
    int basic;

    professor() {
        year = 0;
        basic = 0;
    }

}

class associate_professor extends teacher{
    int year;
    int basic;

    associate_professor() {
        year = 0;
        basic = 0;
    }
}
class assistant_professor extends teacher{
    int year;
    int basic;

    assistant_professor() {
        year = 0;
        basic = 0;
    }
}

public class exp7 {
}
