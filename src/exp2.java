import java.util.Scanner;

import static java.lang.System.exit;

public class exp2 {

    public static void factorial(double num){
        double i, j = 1;
        for (i = num; i > 0 ; i--)
        {
            j=j*i;
        }
        System.out.println("\n Factorial of " + num + " is : " + j);
    }

    public static void testArmstrong(int num){
        int check, rem, sum = 0;
        check = num;
        while (check > 0)
        {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
        }
        if (sum == num)
            System.out.println("\n " + num + " is an Armstrong number.");
        else
            System.out.println("\n " + num + " is Not an Armstrong number.");
    }

    public static void testPalindrome(int num){
        int r,sum=0,temp;
        temp=num;
        while(temp > 0){
            r = temp % 10;
            sum = (sum * 10) + r;
            temp = temp / 10;
        }
        if(temp == sum)
            System.out.println("\n " + num + " is a Palindrome number.");
        else
            System.out.println("\n " + num + " is Not a Palindrome number.");
    }

    public static void testPrime(int num){
        int b = 0;
        if (num == 1)
            System.out.println("\n 1 is neither prime nor composite.");
        else {
            for (int a = 2; a < num ; a++)
            {
                if (num % a == 0) {
                    b = 1;
                    break;
                }
            }
            if (b == 0)
            {
                System.out.println("\n " + num + " is a Prime number");
            }
            else
                System.out.println("\n " + num + " is not a Prime number.");
        }
    }

    public static void fibonacciSeries(int num){
        int a = 0, b = 1, sum = 0;
        System.out.print("\n Fibonnacci series : \n");
        while (sum <= num)
        {
            System.out.println(" \t" + sum);
            sum=a+b;
            a=b;
            b=sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("\n 1.Enter the program\n 2.Exit");
            System.out.print(" Enter your choice : ");
            int ch = sc.nextInt();

            switch (ch)
            {
                case 1: System.out.print("\n Enter a number : ");
                        int x = sc.nextInt();

                        factorial(x);
                        testArmstrong(x);
                        testPalindrome(x);
                        testPrime(x);
                        fibonacciSeries(x);
                        break;

                case 2: System.out.println(" --------------Exit------------");
                        exit(1);

                default: System.out.println("-------------Invalid Input------------\n");
                        break;
            }
        }
    }
}