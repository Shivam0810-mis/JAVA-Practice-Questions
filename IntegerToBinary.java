import java.util.Scanner;

public class IntegerToBinary {

    // Manual conversion using division and remainder
    public static String convertToBinary(int number) {
        if (number == 0) return "0";

        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Using built-in method
        String builtInBinary = Integer.toBinaryString(num);
        System.out.println("Binary (using built-in method): " + builtInBinary);

        // Using manual method
        String manualBinary = convertToBinary(num);
        System.out.println("Binary (manual conversion): " + manualBinary);

        scanner.close();
    }
}