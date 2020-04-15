import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main (String[] args) {
        /*
        Set up variables
        random generator with a max and min
        boolean to check if user has quit or not
        userNum to store user input value
         */
        Random randomGen = new Random();
        int min = 1;
        int max = 10;
        boolean hasQuit = false;
        int randomNum = randomGen.nextInt(max - min + 1) + 1; //creates a random number between min and max
        Scanner input = new Scanner(System.in);
        int userNum = 0;

        //Ask the user for a value
        System.out.print("I am thinking of a number between " + min + " and " + max + ". Enter a guess: ");
        userNum = input.nextInt();

        /*
        While the user's guess is different from the random number, loop continues and asks for a number
        If the user types in -1, then hasQuit is set to true which breaks the conditions of the loop and exits it
        If the user enters the correct number, then the loop also exits
         */
        while(userNum != randomNum && hasQuit == false) {
            System.out.print("Wrong! Type -1 to quit or guess again: ");
            userNum = input.nextInt();
            if (userNum == -1) {
                hasQuit = true;
            }
        }

        /*
        Compares the user number with the random number. If they are equal, prints out "correct."
        Otherwise, it just says goodbye
         */
        if (userNum == randomNum) {
            System.out.println("Correct!");
        } else {
            System.out.println("Goodbye.");
        }
    }

}
