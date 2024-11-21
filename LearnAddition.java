
import java.util.Scanner;

public class LearnAddition {

    public static void main(String[] args) {
        //BMI PROBLEM SOLUTION
        Scanner input = new Scanner(System.in);

      //MATH ADDITION TEST FOR ADDITION LEARNERS
       int max = 9;
       int min = 0;
       int a = (int) (Math.random() * (max - min + 1) + min);
       int b = (int) (Math.random() * (max - min + 1) + min);

       System.out.println("What is the sum of " + a + " and " + b);

       int resultR = a + b;
    
       int user = input.nextInt();

       if (resultR == user) {
           System.out.println("Your answer is Correct!");
       } else {
           System.out.println("OPPs!, Wrong answer");
       }

    }
}
