public class Largest {
    public static void main(String[] args) {
        int[] arr2={12, 16, 45, 23, 51};
        int largest = 0;
            for (int i = 1; i < arr2.length; i++) {
                if (arr2[i] > largest) {
                    largest = arr2[i];
                }
            }
            System.out.println("Largest: " + largest);


            //sum
            int sum =0;
            for (int i = 0; i < arr2.length; i++) {
                sum += arr2[i];
                System.out.println(sum);
            }   
        
    }
}
