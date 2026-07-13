public class CircleArea {

    public static void main(String[] args) {

        double radius = 5.0;

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        // Display results
        System.out.println("Circle Calculator");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}