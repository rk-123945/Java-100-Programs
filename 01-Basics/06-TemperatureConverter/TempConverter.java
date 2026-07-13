public class TempConverter {

    public static void main(String[] args) {

        double celsius = 25;
        double fahrenheit = 77;
        double kelvin = 300;

        // Celsius to Fahrenheit and Kelvin
        double cToF = (celsius * 9 / 5) + 32;
        double cToK = celsius + 273.15;

        // Fahrenheit to Celsius and Kelvin
        double fToC = (fahrenheit - 32) * 5 / 9;
        double fToK = fToC + 273.15;

        // Kelvin to Celsius and Fahrenheit
        double kToC = kelvin - 273.15;
        double kToF = (kToC * 9 / 5) + 32;

        System.out.println("Temperature Converter");
        System.out.println("--------------------");

        System.out.println("\nCelsius: " + celsius + " C");
        System.out.println("Fahrenheit: " + cToF + " F");
        System.out.println("Kelvin: " + cToK + " K");

        System.out.println("\nFahrenheit: " + fahrenheit + " F");
        System.out.println("Celsius: " + fToC + " C");
        System.out.println("Kelvin: " + fToK + " K");

        System.out.println("\nKelvin: " + kelvin + " K");
        System.out.println("Celsius: " + kToC + " C");
        System.out.println("Fahrenheit: " + kToF + " F");
    }
}