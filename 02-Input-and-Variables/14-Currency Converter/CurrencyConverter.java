import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Currency Converter");

        System.out.print("Enter amount to convert: ");
        double amount = input.nextDouble();

        System.out.println("\nChoose the currency conversion:");
        System.out.println("1. USD to EUR");
        System.out.println("2. USD to GBP");
        System.out.println("3. USD to JPY");
        System.out.println("4. EUR to USD");
        System.out.println("5. GBP to USD");
        System.out.println("6. JPY to USD");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        double rate = 0;
        String from = "";
        String to = "";

        switch (choice) {
            case 1:
                rate = 0.92;
                from = "USD";
                to = "EUR";
                break;
            case 2:
                rate = 0.79;
                from = "USD";
                to = "GBP";
                break;
            case 3:
                rate = 156.50;
                from = "USD";
                to = "JPY";
                break;
            case 4:
                rate = 1.09;
                from = "EUR";
                to = "USD";
                break;
            case 5:
                rate = 1.27;
                from = "GBP";
                to = "USD";
                break;
            case 6:
                rate = 0.0064;
                from = "JPY";
                to = "USD";
                break;
            default:
                System.out.println("Invalid option.");
                input.close();
                return;
        }

        double converted = amount * rate;

        System.out.println("\nConversion Summary");
        System.out.println("Original Amount: " + df.format(amount) + " " + from);
        System.out.println("Exchange Rate: " + rate);
        System.out.println("Converted Amount: " + df.format(converted) + " " + to);

        input.close();
    }
}