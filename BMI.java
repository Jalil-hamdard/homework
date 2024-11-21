import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        //BMI PROBLEM SOLUTION
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------------------------------WELCOME TO BMI TEST---------------------------------");

        System.out.println("enter your weight (KG): ");
        double weight = input.nextDouble();

        System.out.println("enter your height (Meter): ");
        double hieght = input.nextDouble();

        double result = weight / hieght;

        if (result < 18.5) {

            System.out.println("You are underweight!");
        } else if (result >= 18.5 && result < 25.0) {
            System.out.println("You are normal!");
        } else if (result >= 25.0 && result < 30.0) {
            System.out.println("You are overweight!");
        } else if (result >= 30.0) {
            System.out.println("Your are obese");
        }

    }
}
