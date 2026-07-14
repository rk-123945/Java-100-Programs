import java.util.ArrayList;
import java.util.Scanner;

enum CustomerType {
    RESIDENTIAL,
    BUSINESS,
    INDUSTRIAL
}


class Customer {

    private String name;
    private CustomerType type;

    public Customer(String name, CustomerType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public CustomerType getType() {
        return type;
    }
}

class ElectricityBill {

    private Customer customer;
    private double units;
    private double energyCost;
    private double tax;
    private double serviceFee;
    private double discount;

    public ElectricityBill(Customer customer, double units) {
        this.customer = customer;
        this.units = units;
        calculateBill();
    }

    private void calculateBill() {

        if (units <= 100) {

            energyCost = units * 0.12;
        } 
        else if (units <= 300) {

            energyCost = (100 * 0.12) +
                         ((units - 100) * 0.15);
        } 
        else if (units <= 500) {

            energyCost = (100 * 0.12) +
                         (200 * 0.15) +
                         ((units - 300) * 0.20);
        } 
        else {

            energyCost = (100 * 0.12) +
                         (200 * 0.15) +
                         (200 * 0.20) +
                         ((units - 500) * 0.25);
        }

        switch(customer.getType()) {

            case BUSINESS:

                serviceFee = 20;
                energyCost *= 1.10;
                break;

            case INDUSTRIAL:

                serviceFee = 50;
                energyCost *= 1.20;
                break;

            case RESIDENTIAL:

                serviceFee = 5;
                break;
        }

        if (units < 150) {

            discount = energyCost * 0.05;
        }

        tax = (energyCost - discount) * 0.07;

    }

    public double getTotal() {

        return energyCost + serviceFee + tax - discount;
    }

    public void printBill() {

        System.out.println("\nELECTRICITY BILL");

        System.out.println("Customer: " + customer.getName());
        System.out.println("Type: " + customer.getType());
        System.out.println("Usage: " + units + " kWh");

        System.out.printf("Energy Cost: $%.2f%n", energyCost);
        System.out.printf("Discount: $%.2f%n", discount);
        System.out.printf("Service Fee: $%.2f%n", serviceFee);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("TOTAL BILL: $%.2f%n", getTotal());
    }

}

public class ElectBillCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ElectricityBill> bills = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\nElectricity Management System");
            System.out.println("-----------------------------");
            System.out.println("1. Create New Bill");
            System.out.println("2. View Number of Bills");
            System.out.println("3. View All Bills");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int option = input.nextInt();
            input.nextLine();
            switch(option) {
                case 1:
                    System.out.print("\nCustomer name: ");
                    String name = input.nextLine();

                    System.out.println("\nChoose customer type:");
                    System.out.println("1. Residential");
                    System.out.println("2. Business");
                    System.out.println("3. Industrial");
                    System.out.print("Choice: ");
                    int choice = input.nextInt();
                    CustomerType type;

                    switch(choice) {

                        case 2:

                            type = CustomerType.BUSINESS;
                            break;

                        case 3:

                            type = CustomerType.INDUSTRIAL;
                            break;

                        default:

                            type = CustomerType.RESIDENTIAL; 
                    }
                    System.out.print("Electricity usage (kWh): ");
                    double units = input.nextDouble();
                    Customer customer = new Customer(name, type);
                    ElectricityBill bill = new ElectricityBill(customer, units);
                    bills.add(bill);
                    bill.printBill();
                    break;
                case 2:
                    System.out.println("\nTotal bills created: " + bills.size());
                    break;
                case 3:
                    if (bills.size() == 0) {
                        System.out.println("\nNo bills available.");
                    } 
                    else {
                        System.out.println("\nAll Bills:");

                        for (ElectricityBill b : bills) {
                            b.printBill();

                        }
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("\nClosed");
                    break;
                default:
                    System.out.println("\nInvalid option.");

            }

        }

        input.close();
    }
}