import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("   Student Grade Calculator");
    

        // Get student info
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of assignments: ");
        int assignments = scanner.nextInt();

        double total = 0;

        // Collect grades
        for (int i = 1; i <= assignments; i++) {
            double grade;

            while (true) {
                System.out.print("Enter grade for assignment " + i + ": ");
                grade = scanner.nextDouble();

                if (grade >= 0 && grade <= 100) {
                    break;
                }

                System.out.println("Grade must be between 0 and 100.");
            }

            total += grade;
        }

        // Calculate average
        double average = total / assignments;

        // Letter grade
        String letterGrade;

        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        // Determine status
        String status;

        if (average >= 60) {
            status = "Passed";
        } else {
            status = "Failed";
        }

        // Give feedback
        String feedback;

        switch (letterGrade) {
            case "A":
                feedback = "Excellent work! Keep it up.";
                break;
            case "B":
                feedback = "Great job! A little more effort can get you an A.";
                break;
            case "C":
                feedback = "Good effort. Review the material to improve.";
                break;
            case "D":
                feedback = "Needs improvement. More practice is recommended.";
                break;
            default:
                feedback = "You should spend more time studying.";
        }

        // Display results
        System.out.println("       Final Report");

        System.out.println("Student: " + name);
        System.out.println("Assignments: " + assignments);
        System.out.printf("Average: %.2f%%%n", average);
        System.out.println("Grade: " + letterGrade);
        System.out.println("Status: " + status);
        System.out.println("Feedback: " + feedback);

        scanner.close();
    }
}