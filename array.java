public class array{

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Array order:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        System.out.print("Array printed in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
}
}