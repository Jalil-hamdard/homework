
import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // THE AREA OF A CIRCLE #1

        double r;
        double a;
        System.out.println("enter the reduis of the cirlce");
        r = input.nextDouble();
        a = r*r*3.14;
        System.out.println("the area is :" + a);
        
        // THE PERIMETER OF THE CIRCLE #2

        System.out.println("enter the reduis of the cirlce:");
        double p = input.nextDouble();
        double q = 2*3.14*p;
        System.out.println("the perimeter is: "+ q);

        //CALCULATING THE AREA OF A TRINGLE #3

        System.out.println("enter the base of the tringle:");
        double base = input.nextDouble();
        System.out.println("enter the hieght of the tringle:");
        double hieght = input.nextDouble();
        double result = 0.5*base*hieght;
        System.out.println("the are of the tringle is :"+ result);

        //CALCULTING THE ARE OF A RECTANGLE #4

        System.out.println("enter the width of the rectangle:");
        double width = input.nextDouble();
        System.out.println("enter the length of the rectangle:");
        double length = input.nextDouble();
        double result1 = width*length;
        System.out.println("the are of the rectangle is "+ result1);

        //CALCULTING THE PERIMETER OF THE RECTANGLE #5

        System.out.println("enter the length of the recgtangle");
        double rlength = input.nextDouble();
        System.out.println("enter the width of the rectangle:");
        double rwidth = input.nextDouble();
        double rresult = 2*(rlength*rwidth);
        System.out.println("the perimeter of the rectangle is "+ rresult);


       // SIR GEE I CAN CODE ALL OF THE PROJECTS AND I THINK IT IS ENOUGH TO PROVE 
       // THANK YOU!








    }
    
}
