import java.util.HashSet;

public class CRUDoperations {
    public static void main(String[] args) {
        // Declare a HashSet to store String elements
        HashSet<String> fruits = new HashSet<>();
        // add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Adding a Duplicate element;which will not be ignored
        System.out.println("Fruits in HashSet: " + fruits); // Output order is not guranteed

        // Check if an element exists
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana " + containsBanana);

        // Remove an element
        fruits.remove("Orange");
        System.out.println("Fruits after removing Orange: " + fruits);

        // Check the size of the empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is HashSet empty: " + isEmpty);
    }
}
