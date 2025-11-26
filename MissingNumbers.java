import java.util.*;

public class MissingNumbers{
    public static void main(String[] args) {
         Set<Integer> given = new HashSet<>(Arrays.asList(1, 2, 4, 6, 7, 9, 10));
         Set<Integer> full = new HashSet<>();
         for (int i = 1; i <= 10; i++) {
             full.add(i);
         }
         full.removeAll(given);
         System.out.println("Missing numbers: " + full);
    } 
}
