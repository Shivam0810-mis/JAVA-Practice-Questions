import java.util.*;

public class UniqueSortedNumbers {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
        HashSet<Integer> numbers = new HashSet<>();

        System.out.println("Enter 5 Integers:");

        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            numbers.add(num);// to remove duplicates
        }

        //covert HashSet to List
        List<Integer> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList);// sort the list

        System.out.println("\nUnique numbers in sorted order:");
        for(int n : sortedList){
            System.out.println(n);
            }
        }
    }
}
