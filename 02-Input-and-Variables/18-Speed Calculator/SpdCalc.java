import java.util.Scanner;

public class SpdCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Speed Calculator");

        System.out.print("Enter distance traveled: ");
        double distance = input.nextDouble();

        System.out.print("Enter time taken: ");
        double time = input.nextDouble();

        System.out.print("Enter distance unit (miles/km): ");
        String distanceUnit = input.next();

        System.out.print("Enter time unit (hours/minutes): ");
        String timeUnit = input.next();

        double convertedTime = time;

        if (timeUnit.equalsIgnoreCase("minutes")) {
            convertedTime = time / 60;
        }

        double speed = distance / convertedTime;

        double averagePace = convertedTime / distance;

        System.out.println("\nResults");
        System.out.println("Distance: " + distance + " " + distanceUnit);
        System.out.println("Time: " + time + " " + timeUnit);
        System.out.println("Speed: " + speed + " " + distanceUnit + " per hour");
        System.out.println("Average Pace: " + averagePace + " hours per " + distanceUnit);

        input.close();
    }
}