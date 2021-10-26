// Write a Java program to illustrate Constructor Chaining

class stud {
    String name;
    int age;
    int rollNO;
    String phoneNO;

    stud(){
        this.name = "NULL";
        this.age = 0;
    }

    stud(String n) {
        this(20, 38, "7400399677");
        name = n;
        System.out.println(" My name is : " + name + "\n My age is : " + age + "\n My Roll No is : " + rollNO + "\n My Phone No is : " + phoneNO);
        System.out.println();
    }

    stud(int a, int id, String ph) {
        this.age = a;
        this.rollNO = id;
        this.phoneNO = ph;
    }
}

public class exp6 {
    public static void main(String[] args) {
        stud st = new stud("FLAME");
    }
}