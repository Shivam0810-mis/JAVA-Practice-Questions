import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        long total = 0;
        for (int i = 1; i <= n; i++) {
            total += (long) i * i; // i^2
        }
        System.out.println(total);

        sc.close();
    }
}