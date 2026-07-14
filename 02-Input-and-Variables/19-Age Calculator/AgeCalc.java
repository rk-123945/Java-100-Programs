import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Age Calculator");

        System.out.print("Enter birth year: ");
        int year = input.nextInt();

        System.out.print("Enter birth month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter birth day: ");
        int day = input.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        if (birthDate.isAfter(currentDate)) {
            System.out.println("Invalid birth date. Birth date cannot be in the future.");
        } else {
            Period age = Period.between(birthDate, currentDate);

            System.out.println("\nResults");
            System.out.println("Birth Date: " + birthDate);
            System.out.println("Current Date: " + currentDate);
            System.out.println("Age: " + age.getYears() + " years, "
                    + age.getMonths() + " months, and "
                    + age.getDays() + " days");

            int totalDays = (int) (currentDate.toEpochDay() - birthDate.toEpochDay());

            System.out.println("Total Days Lived: " + totalDays);
        }

        input.close();
    }
}