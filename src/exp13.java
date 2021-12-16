// Write java program where user will enter loginId and password as input.
// The password should be 8 digit containing one digit and one special symbol.
// If user enter valid password satisfying above criteria then show “Login Successful Message”.
// If user enter invalid Password then create InvalidPasswordException stating Please enter valid
// password of length 8 containing one digit and one Special Symbol.

import java.util.Scanner;

class InvalidPasswordException extends Exception {
    InvalidPasswordException() {
        System.out.println(" Please enter valid password of length 8 containing one digit and one Special Symbol.");
    }
}

public class exp13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter login ID : ");
        String loginID = sc.next();
        System.out.print(" Enter password : ");
        String pass = sc.next();
        int symbol = 0, digit = 0;

        for (int i = 0; i < pass.length(); i++) {
            if (pass.length() == 8) {
                if (pass.charAt(i) == '_' || pass.charAt(i) == '#' || pass.charAt(i) == '@'  || pass.charAt(i) == '$' || pass.charAt(i) == '*')
                {
                    symbol++;
                } else if (pass.charAt(i) == '0'  || pass.charAt(i) == '1' || pass.charAt(i) == '2' || pass.charAt(i) == '3' || pass.charAt(i) == '4'
                        || pass.charAt(i) == '5' || pass.charAt(i) == '6' || pass.charAt(i) == '7' || pass.charAt(i) == '8' || pass.charAt(i) == '9')
                {
                    digit++;
                }
            }
        }

        if (symbol > 0 && digit > 0) {
            System.out.println(" Login Successful");
        } else {
            try {
                throw new InvalidPasswordException();
            } catch (InvalidPasswordException e) {
                System.out.println(e);
            }
        }
    }
}