public class SimpleInterest {

    public static void main(String[] args) {
        
        double principal = 1000.0; 
        double rate = 5.0;   
        double time = 3.0;   

        // Simple Interest formula: (P × R × T) / 100
        double interest = (principal * rate * time) / 100;

        double totalAmount = principal + interest;

        // Display results
        System.out.println("Simple Interest Calculator");
        System.out.println("-------------------------");
        System.out.println("Principal: $" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: $" + interest);
        System.out.println("Total Amount: $" + totalAmount);
    }
}