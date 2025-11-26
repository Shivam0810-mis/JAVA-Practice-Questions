// Accept a paragraph and displat all unique words used

import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a sentence:");
        String line = sc.nextLine();

        // Split the paragraph into words using regex to handle punctuation
        String[] words = line.toLowerCase().split("\\W+");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        System.out.println("\nUnique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
            }
        }
    }    
}
