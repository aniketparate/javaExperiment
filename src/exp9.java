// A university has two types of students --> graduate students and research students.
// The University maintains the record of name, age and programme of every student.
// For graduate students, additional information like percentage of marks and stream, like science, commerce, etc. is recorded;
// whereas for research students, additionally, specialization and years of working experience, if any, is recorded.
// Each class has a constructor. The constructor of subclasses makes a call to constructor of the superclass.
// Assume that every constructor has the same number of parameters as the number of instance variables.
// In addition, every subclass has a method that may update the instance variable values of that subclass.
// All the classes have a function display_student_info( ), the subclasses must override this method of the base class.
// Every student is either a graduate student or a research student. Perform the following tasks for the description given above using Java :
//      (i) Create the three classes with proper instance variables and methods, with suitable inheritance.
//      (ii) Create at least one parameterised constructor for each class.
//      (iii) Implement the display_student_info( ) method in each class.

class university {
    String name;
    int age;
    String programme;

    university(String n, int a, String p) {
        name = n;
        age = a;
        programme = p;
    }

    void display_student_info() {
        System.out.println("\n Name : " + name + "\n Age : " + age + "\n Programme : " + programme);
    }
}

class graduate_student extends university {
    int percentage;
    String stream;

    graduate_student(String n, int a, String p, int marks, String s) {
        super(n, a, p);
        percentage = marks;
        stream = s;
    }

    void display_student_info() {
        System.out.println("\n Name : " + name + "\n Age : " + age + "\n Programme : " + programme + "\n Percentage : " + percentage + "\n Stream : " + stream);
    }
}

class research_student extends university {
    String specialization;
    int years_of_work;

    research_student(String n, int a, String p, String spe, int y) {
        super(n, a, p);
        specialization = spe;
        years_of_work = y;
    }

    void display_student_info() {
        System.out.println("\n Name : " + name + "\n Age : " + age + "\n Programme : " + programme + "\n Percentage : " + specialization + "\n Stream : " + years_of_work);
    }
}

public class exp9 {
    public static void main(String[] args) {
        graduate_student GS = new graduate_student("Aniket", 20, "Engineering", 80, "IT");
        GS.display_student_info();

        research_student RS = new research_student("Rahul", 19, "Engineering", "Masters", 2);
        RS.display_student_info();
    }
}
