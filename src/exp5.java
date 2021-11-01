//Create a Java based application to perform various ways of Method overloading.
//i.e No parameters, types of paratemeters, Constructor Overloading

class operations {
    String name;
    int a, b;

    operations() {
        name = "NULL";
        a = 0;
        b = 0;
    }

    operations(String n) {
        this(1, 2);
        name = n;
        System.out.println(" My name is : " + name);
    }

    operations(int x, int y) {
        a = x;
        b = y;
        System.out.println(" The sum of two numbers is : " + (a + b) + "\n------------------------------------------");
    }

    // No Parameters
    static void display() {
        System.out.println("\n THIS IS A SIMPLE APPLICATION BASED ON JAVA\n------------------------------------------");
    }

    // String return type
    static String print() {
        return " This is the end of application.";
    }
}

public class exp5 {
    public static void main(String[] args) {
        operations.display();
        operations op = new operations("ANIKET");
        operations op1 = new operations(5, 10);
        System.out.println(operations.print());
    }
}
