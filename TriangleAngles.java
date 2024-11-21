public class TriangleAngles{
    public static void main(String[] args) {
        // Coordinates of the triangle 
        double x1 = 3, y1 = 4; // Point A
        double x2 = 7, y2 = 1; // Point B
        double x3 = 5, y3 = 6; // Point C

        // Calculate the lengths of the sides
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)); // Side BC
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)); // Side AC
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); // Side AB

        // Calculate angles using the law of cosines
        double angleA = Math.acos((b * b + c * c - a * a) / (2 * b * c)); // Angle A in radians
        double angleB = Math.acos((a * a + c * c - b * b) / (2 * a * c)); // Angle B in radians
        double angleC = Math.acos((a * a + b * b - c * c) / (2 * a * b)); // Angle C in radians

        // Convert radian to degree
        angleA = Math.toDegrees(angleA);
        angleB = Math.toDegrees(angleB);
        angleC = Math.toDegrees(angleC);

        // Output the angles
        System.out.printf("Angle A: %.2f degrees%n", angleA);
        System.out.printf("Angle B: %.2f degrees%n", angleB);
        System.out.printf("Angle C: %.2f degrees%n", angleC);
    }
}
