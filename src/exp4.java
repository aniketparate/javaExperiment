import java.util.Scanner;

class student{
    String name;
    String age;
    String address;

    student(){
        name = "unknown";
        age = "0";
        address = "not available";
    }

    void setInfo(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display(){
        System.out.print("" + name);
        System.out.print("\t\t\t" + age);
        System.out.print("\t\t\t" + address);
        System.out.println();
    }
}

public class exp4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        student[] std = new student[10];

        String[] name = new String[10];
        String[] age = new String[10];
        String[] address = new String[10];

        for (int i = 0; i < 10; i++)
        {
            System.out.print(" " + (i + 1) + ") Enter name : ");
            name[i] = sc.next();
            System.out.print("    Enter age : ");
            age[i] = sc.next();
            System.out.print("    Enter address : ");
            address[i] = sc.next();
            System.out.println();
            std[i] = new student();
            std[i].setInfo(name[i], age[i], address[i]);
        }

        System.out.print("\n NAME");
        System.out.print("\t\t\tAGE");
        System.out.println("\t\t\tADDRESS");
        System.out.println("----------------------------------------");
        for (int i = 0; i < 10; i++) {
            std[i].display();
        }
    }
}