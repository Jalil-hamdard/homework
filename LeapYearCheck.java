
import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args) {
        
        
        System.out.println("----------------------------------------------------WELCOME TO LeapYear checkpoint---------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year to check if it's a Leap one: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("It'a a Leap year.");
        } else {
            System.out.println("It's not a leap year");
        }

    }
}
