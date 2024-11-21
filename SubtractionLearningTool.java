import java.util.Scanner;
import java.util.Random;

public class SubtractionLearningTool{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberOfQuestions = 5; // Total number of questions
        int correctAnswers = 0;    // Counter for correct answers

        System.out.println("Welcome to the Math Subtraction Learning Tool!");

        for (int i = 1; i <= numberOfQuestions; i++) {
            // Generate two random numbers (ensure the result is non-negative)
            int number1 = random.nextInt(100); // Random number between 0-99
            int number2 = random.nextInt(100); // Random number between 0-99

            if (number1 < number2) {
                // Swap to avoid negative results
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // Display the question
            System.out.printf("Question %d: What is %d - %d? ", i, number1, number2);
            int studentAnswer = scanner.nextInt();

            // Check the answer
            int correctAnswer = number1 - number2;
            if (studentAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Wrong! The correct answer is " + correctAnswer + ".");
            }
        }

        // Display the total correct answers
        System.out.println("\nYou answered " + correctAnswers + " out of " + numberOfQuestions + " questions correctly.");
        System.out.println("Thank you for practicing subtraction!");
    }
}
