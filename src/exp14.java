// Java Program to Create Account with 1000 Rs Minimum Balance, Deposit Amount, Withdraw Amount and Also Throws LessBalanceException.
// It has a Class Called LessBalanceException Which returns the Statement that Says WithDraw Amount(_Rs) is Not Valid.
// It has a Class Which Creates 2 Accounts, Both Account Deposit Money and One Account Tries to
// WithDraw more Money Which Generates a LessBalanceException Take Appropriate Action for the Same.

import java.util.Scanner;

class LessBalanceException extends Exception {

}

class Account {
    public Scanner sc = new Scanner(System.in);
    int Min_Bal = 1000;
    int Deposit;
    int Withdraw;
    public int Balance = Min_Bal;

    void setDeposit() {
        System.out.print(" Enter amount to be deposited : ");
        Deposit = sc.nextInt();
        Balance = Balance + Deposit;
    }

    void setWithdraw() {
        System.out.print(" Enter amount to be withdrawn : ");
        Withdraw = sc.nextInt();
        Balance = Balance - Withdraw;
    }
}

public class exp14 {
    public static void main(String[] args) {
        Account a = new Account();
        a.setDeposit();
        a.setWithdraw();

        System.out.println(" Balance : " + a.Min_Bal);
        if (a.Balance > 1000){
            System.out.println(" Balance : " + a.Balance);
        } else {
            try {
                throw new LessBalanceException();
            } catch (LessBalanceException e) {
                System.out.println("\n WithDraw Amount (" + a.Withdraw + " Rs) is Not Valid.");
            }
        }
    }
}