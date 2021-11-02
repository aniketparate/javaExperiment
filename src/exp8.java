// Create a class Book and define a display method to display book information.
// Inherit Reference_Book and Magazine classes from Book class and override display method of Book class in Reference_Book and Magazine classes.
// Make necessary assumptions required.

class book {
    String title;

    void display() {
        System.out.println("\n Title of the book : " + title);
    }
}

class Reference_book extends book {
    String a_name;
    int p_year;

    void display() {
        System.out.println("\n Title of book : " + title + "\n Name of Author : " + a_name +"\n Year of Publishing : " + p_year);
        System.out.println("------------------------------");
    }
}

class Magazine extends book {
    int p_year;

    void display() {
        System.out.println(" Title of book : " + title + "\n Year of Publishing : " + p_year);
    }
}

public class exp8 {
    public static void main(String[] args) {
        book superOB = new book();
        Reference_book subOB = new Reference_book();
        Magazine subOB1 = new Magazine();

        superOB.title = "The Dark Hour";

        subOB.title = "Java : The Complete Reference";
        subOB.a_name = "Herbert Schildt";
        subOB.p_year = 2019;
        subOB.display();

        subOB1.title = "Forbes";
        subOB1.p_year = 2021;
        subOB1.display();
    }
}