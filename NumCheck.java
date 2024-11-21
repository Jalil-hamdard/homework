
import java.util.Scanner;

public class NumCheck {

    public static void main(String[] args) {

        System.out.println("----------------------------------------------------WELCOME TO NUMBER CHECKPOINT---------------------------------");
        System.out.println("Please enter a phone number :");
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        if (number.length() == 10 && number.startsWith("078")) {

            System.out.println("This number is related to Etislat company ");

        } else if (number.length() == 10 && (number.startsWith("077") || number.startsWith("076"))) {

            System.out.println("This number is related to MTN company");

        } else if (number.length() == 10 && number.startsWith("070")) {

            System.out.println("This number is related to AWC");
        } else {
            System.out.println("Invalid number");
        }

    }

}
