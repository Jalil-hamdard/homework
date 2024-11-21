import java.util.Scanner;

public class GCD{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // positive numbers
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        // Calculate GCD
        int gcd = num1;
        int temp = num2;

        while (temp != 0) {
            int remainder = gcd % temp;
            gcd = temp;
            temp = remainder;
        }

        // Output the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
