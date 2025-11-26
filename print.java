import java.util.Scanner;
import java.util.Random;

public class print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors");

        int userChoice = sc.nextInt();
        int computerChoice = rand.nextInt(3) + 1; // generates 1,2,3

        // Show choices
        System.out.println("You chose: " + choiceToString(userChoice));
        System.out.println("Computer chose: " + choiceToString(computerChoice));

        // Decision making
        if (userChoice == computerChoice) {
            System.out.println("It's a draw!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        sc.close();
    }

    // helper function to display choices as text
    public static String choiceToString(int choice) {
        if (choice == 1) return "Rock";
        else if (choice == 2) return "Paper";
        else if (choice == 3) return "Scissors";
        else return "Invalid";
    }
}