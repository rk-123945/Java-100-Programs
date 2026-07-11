public class PrintASCII {
    public static void main(String[] args) {
        int bodyHeight = 3;  // Change this to make the cat taller
        int tailLength = 4;  // Change this to make the tail longer

        
        System.out.println(" /\\_/\\ ");
        System.out.println("( o.o )");

        
        for (int i = 0; i < bodyHeight; i++) {
            System.out.println(" |   | ");
        }

        
        System.out.print("(___.___)");

        
        for (int i = 0; i < tailLength; i++) {
            System.out.print("~");
        }
        
        
        System.out.println(); 
    }
}