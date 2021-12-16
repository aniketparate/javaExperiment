import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class practical {
    public static void main(String[] args) {
        File myFile = new File("New.txt");

        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (myFile.exists()) {
            System.out.println(" " + myFile.getName() + " exists");
            System.out.println(" The file is " + myFile.length() + " bytes long");

            if (myFile.canRead()) {
                System.out.println(" It's ok to read");
            } else {
                System.out.println(" It's not ok to read");
            }

            if (myFile.canWrite()) {
                System.out.println(" It's ok to write");
                try {
                    FileWriter newfile = new FileWriter("New.txt");
                    System.out.println("\n Write into the new file.");
                    newfile.write("Hello myself ANIKET Parate");
                    newfile.write("\nThis is my newly made file.");
                    newfile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(" It's not ok to write");
            }

            System.out.println("\n path: " +myFile.getAbsolutePath());
            System.out.println(" File Name: "+ myFile.getName());
            System.out.println(" File Size: "+ myFile.length() + " bytes");
        } else {
            System.out.println("File does not exist");
        }
    }
}