class employ {
    String name;
    String year;
    String address;
    String salary;

    employ(String name, String year, String address, String salary) {
        this.name = name;
        this.year = year;
        this.address = address;
        this.salary = salary;
    }

    void display(){
        System.out.print("" + name);
        System.out.print("\t\t\t" + year);
        System.out.print("\t\t\t" + address);
        System.out.print("\t\t\t" + salary);
        System.out.println();
    }
}

public class exp3 {
    public static void main(String[] args) {

        employ[] emp = new employ[3];

        emp[0] = new employ("Robert", "2001", "Kurla", "50000/-");
        emp[1] = new employ("Mahesh", "2002", "Bandra", "35000/-");
        emp[2] = new employ("Ramesh", "2004", "Mumbai", "30000/-");

        System.out.print("\n NAME");
        System.out.print("\t\tYEAR OF JOINING");
        System.out.print("\t\tADDRESS");
        System.out.println("\t\t\tSALARY");
        System.out.println("---------------------------------------------------------");
        for (int counter = 0; counter < 3; counter++)
        {
            emp[counter].display();
        }
    }
}
