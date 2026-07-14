import java.util.Scanner;

public class BMICalc {

    public static double getPositiveNumber(Scanner input, String message) {
        double value;

        while (true) {
            System.out.print(message);

            if (input.hasNextDouble()) {
                value = input.nextDouble();

                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Value must be greater than zero.");
                }

            } else {
                System.out.println("Invalid input.");
                input.next();
            }
        }
    }

    // age
    public static int getPositiveAge(Scanner input) {
        int age;

        while (true) {
            System.out.print("Enter age: ");

            if (input.hasNextInt()) {
                age = input.nextInt();

                if (age > 0) {
                    return age;
                } else {
                    System.out.println("Age must be greater than zero.");
                }

            } else {
                System.out.println("Invalid input.");
                input.next();
            }
        }
    }

    // Adult
    public static String getAdultCategory(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal Weight";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    // Senior (65+)
    public static String getSeniorCategory(double bmi) {
        if (bmi < 23)
            return "Underweight";
        else if (bmi < 30)
            return "Healthy Weight";
        else
            return "Overweight";
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("BMI Calculator:");

        int age = getPositiveAge(input);
        double weight = getPositiveNumber(input, "Enter weight (kg): ");
        double height = getPositiveNumber(input, "Enter height (meters): ");

        double bmi = weight / (height * height);

        String category;

        if (age >= 65) {
            category = getSeniorCategory(bmi);
        } else {
            category = getAdultCategory(bmi);
        }

        System.out.println("\nBMI Results");
        System.out.printf("Age: %d years%n", age);
        System.out.printf("Weight: %.2f kg%n", weight);
        System.out.printf("Height: %.2f m%n", height);
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Category: " + category);
        System.out.println("Not a medical diagnosis. Consult a healthcare professional for personalized advice.");
        input.close();
    }
}