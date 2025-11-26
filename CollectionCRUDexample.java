import java.util.*;
public class CollectionCRUDexample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("Orignal Fruits List : " + fruits);

        // Access elements
        System.out.println("Element at Index 2 : " + fruits.get(2));

        // Modify elements
        fruits.set(1, "Grapes");
        System.out.println("Fruits List after Modification : " + fruits);

        // Insert elements
        fruits.add(2, "Pineapple");
        System.out.println("Fruits List after Insertion of Pineapple : " + fruits);
        
        // Remove elements
        fruits.remove(3);
        System.out.println("Fruits List after Deletion at Index 3 : " + fruits);

        fruits.remove("Mango");
        System.out.println("Fruits List after Deletion of Mango : " + fruits);

        // Check if element Available
        System.out.println("Is Kiwi Available : " + fruits.contains("Kiwi"));

        //Get Size of Collection
        System.out.println("Size of Fruits List : " + fruits.size());
        
        //Sort the Collection
        Collections.sort(fruits);
        System.out.println("Sorted Fruits List : " + fruits);
        
        //Iterate through the Collection - 1
        System.out.print("Iterating through Fruits List : ");
        for(String string : fruits) {
            System.out.print(string + " ");
        } 

        //Iterate through the Collection - 2 (using iterator)
        System.out.print("\nIterating through Fruits List using Iterator: ");
        Iterator<String> iterator = fruits.iterator();  
        while(iterator.hasNext()) {  
            System.out.print(iterator.next() + " ");
        }

        //Clear the Collection
        fruits.clear();
        System.out.println("\nFruits List after Clear : " + fruits);

    }
}
