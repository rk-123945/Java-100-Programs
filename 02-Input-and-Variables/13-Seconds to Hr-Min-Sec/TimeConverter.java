import java.util.Scanner;

public class TimeConverter {

    public static int getSeconds(Scanner input) {

        while (true) {

            System.out.print("Enter total seconds: ");

            if (input.hasNextInt()) {

                int seconds = input.nextInt();

                if (seconds >= 0) {
                    return seconds;
                } else {
                    System.out.println("Please enter zero or greater.");
                }

            } else {
                System.out.println("Invalid input.");
                input.next();
            }
        }
    }

    public static void convertTime(int totalSeconds) {

        int hours = totalSeconds / 3600;
        int remaining = totalSeconds % 3600;

        int minutes = remaining / 60;
        int seconds = remaining % 60;

        System.out.println("\nTime Conversion");
        System.out.println("Total Seconds: " + totalSeconds);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        System.out.printf("Formatted Time: %02d:%02d:%02d%n",
                hours, minutes, seconds);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Seconds to Hours Minutes Seconds Converter");

        int totalSeconds = getSeconds(input);

        convertTime(totalSeconds);

        input.close();
    }
}