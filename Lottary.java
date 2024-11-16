
import java.util.Scanner;

public class Lottary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // LOTTARY PROJEECT DONE
        System.out.println("----------------------------------------------------WELCOME TO LOTTARY---------------------------------");
        int max = 99;
        int min = 10;
        int a = (int) (Math.random() * (max - min + 1) + min);

        System.out.println("Please enter the two digit number: ");
        int x = input.nextInt();

        int aDigit1 = a / 10;
        int aDigit2 = a % 10;

        int xDigit1 = x / 10;
        int xDigit2 = x % 10;

        if (a == x) {
            System.out.println("Yow won $10000");
        } else if ((aDigit1 == xDigit2 && aDigit2 == xDigit1)) {

            System.out.println("Yow won $3000");

        } else if (aDigit1 == xDigit1 || aDigit1 == xDigit2 || aDigit2 == xDigit1 || aDigit2 == xDigit2) {

            System.out.println("You won $1000");

        } else {
            System.out.println("Sorry, Faild");
        }

    }
}
