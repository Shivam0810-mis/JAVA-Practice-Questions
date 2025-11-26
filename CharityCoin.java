import java.util.Scanner;

public class CharityCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input (number of days)
        int n = sc.nextInt();

        // Step 2: Initialize total
        long total = 0;

        // Step 3: Loop from 1 to n and add squares
        for (int i = 1; i <= n; i++) {
            total += (long) i * i; // i^2
        }

        // Step 4: Print result
        System.out.println(total);

        sc.close();
    }
}
