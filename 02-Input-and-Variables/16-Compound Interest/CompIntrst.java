import java.util.Scanner;
import java.text.DecimalFormat;

public class CompIntrst {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Compound Interest Calculator");

        System.out.print("Enter principal amount: $");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter number of times interest compounds per year: ");
        int compounds = input.nextInt();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double amount = principal *
                Math.pow((1 + (rate / 100) / compounds), compounds * years);

        double interestEarned = amount - principal;

        System.out.println("\nInvestment Summary");
        System.out.println("Principal: $" + df.format(principal));
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Years: " + years);
        System.out.println("Compoundings Per Year: " + compounds);
        System.out.println("Interest Earned: $" + df.format(interestEarned));
        System.out.println("Final Amount: $" + df.format(amount));

        input.close();
    }
}