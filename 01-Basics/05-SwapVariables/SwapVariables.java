public class SwapVariables {

    public static void main(String[] args) {
        int first = 10;
        int second = 20;
        int temp;

        System.out.println("Before Swapping:");
        System.out.println("First = " + first);
        System.out.println("Second = " + second);

        temp = first;
        first = second;
        second = temp;

        System.out.println("\nAfter Swapping:");
        System.out.println("First = " + first);
        System.out.println("Second = " + second);
    }
}