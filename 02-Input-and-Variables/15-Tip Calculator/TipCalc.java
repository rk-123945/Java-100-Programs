import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalc{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Restaurant Tip Calculator");

        System.out.print("Enter bill amount: $");
        double bill = input.nextDouble();

        System.out.print("Enter tip percentage: ");
        double tipPercent = input.nextDouble();

        System.out.print("Enter number of people splitting the bill: ");
        int people = input.nextInt();

        double tip = bill * (tipPercent / 100);
        double total = bill + tip;
        double eachPays = total / people;

        System.out.println("\nBill Summary");
        System.out.println("Bill Amount: $" + df.format(bill));
        System.out.println("Tip: $" + df.format(tip));
        System.out.println("Total Bill: $" + df.format(total));
        System.out.println("Each Person Pays: $" + df.format(eachPays));

        input.close();
    }
}