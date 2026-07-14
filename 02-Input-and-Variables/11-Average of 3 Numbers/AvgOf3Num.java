import java.util.Scanner;

public class AvgOf3Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (or type 'done' to finish): ");
            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("done")) {
                break;
            }

            try {
                double number = Double.parseDouble(userInput);
                total += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'done'.");
            }
        }

        if (count > 0) {
            double average = total / count;
            System.out.println("The average is " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        input.close();
    }
}