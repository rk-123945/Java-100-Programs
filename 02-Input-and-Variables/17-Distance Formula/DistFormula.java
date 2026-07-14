import java.util.Scanner;

public class DistFormula{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Distance Formula Calculator");

        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        double xDifference = x2 - x1;
        double yDifference = y2 - y1;

        double distance = Math.sqrt(
            Math.pow(xDifference, 2) +
             Math.pow(yDifference, 2)
        );

        double midpointX = (x1 + x2) / 2;
        double midpointY = (y1 + y2) / 2;

        System.out.println("\nResults");
        System.out.println("Distance: " + distance);
        System.out.println("Midpoint: (" + midpointX + ", " + midpointY + ")");

        input.close();
    }
}