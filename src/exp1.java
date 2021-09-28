import java.util.Scanner;

import static java.lang.System.exit;

public class exp1 {
    private static double balance;

    public static void createAccount(String name, String address, String phone_no){
        System.out.println(" NAME : " + name);
        System.out.println(" ADDRESS : " + address);
        System.out.println(" PHONE NO : " + phone_no);
        balance = 100_000;
    }

    public static void deposit(double cashDeposit){
        System.out.println(" ACCOUNT NO : 198465654153");
        System.out.println(" Available balance : 100000");
        System.out.println(" Balance after deposit : " + (balance + cashDeposit));
        balance = balance + cashDeposit;
    }

    public static void  withdraw(double cashWithdraw){
        System.out.println(" Balance after Withdraw : " + (balance - cashWithdraw));
        balance = balance - cashWithdraw;
    }

    public static void computeInterest(){
        System.out.println(" ------------Interest------------ ");
        System.out.println(" Interest on current balance at rate of 6%");
        double interest = (balance * 6) / 100;
        System.out.println(" Interest gained : " + interest);
        System.out.println(" Total balance : " + (balance + interest));
        balance = balance + interest;
    }

    public static void displayBalance(){
        System.out.println(" -------------Balance------------ ");
        System.out.println(" -------------" + balance + "------------ \n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Enter your name : "  );
        String name = sc.nextLine();
        System.out.print(" Enter your address : ");
        String address = sc.nextLine();
        System.out.print(" Enter your phone no : ");
        String phone_no = sc.next();
        System.out.println();
        createAccount(name,address,phone_no);
        System.out.println();

        while (true)
        {
            System.out.println(" 1.DEPOSIT");
            System.out.println(" 2.WITHDRAW");
            System.out.println(" 3.INTEREST");
            System.out.println(" 4.BALANCE");
            System.out.println(" 5.EXIT");
            System.out.print("\n Enter your choice : ");
            int ch = sc.nextInt();

            switch(ch)
            {
                case 1: System.out.print(" Enter amount to deposit : ");
                        double cashDeposit = sc.nextInt();
                        System.out.println();
                        deposit(cashDeposit);
                        System.out.println();
                        break;

                case 2: System.out.print(" Enter amount to withdraw : ");
                        double cashWithdraw = sc.nextInt();
                        System.out.println();
                        withdraw(cashWithdraw);
                        System.out.println();
                        break;

                case 3: computeInterest();
                        System.out.println();
                        break;

                case 4: displayBalance();
                        break;

                case 5: System.out.println(" -------------Exit------------");
                        exit(1);

                default:
                    System.out.println(" -------------Invalid Input------------\n");
                    break;
            }
        }
    }
}