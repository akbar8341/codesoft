import java.util.Scanner;
import java.util.Random;
public class number_game{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int minRange=1;
        int maxRange=100;
        int numberofAttempt=5;
        int score=0;
        System.out.println("welcome to the Number Guessing game!");
        boolean playAgain=true;
        while(playAgain){
            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;
            System.out.println("I've selected a random number between \" + minRange + \" and \" + maxRange + \". Try to guess it!");
            while(attempts < numberofAttempt&&!hasGuessedCorrectly){
                System.out.println("Enter your guess:");
                int userGuess=scanner.nextInt();
                attempts++;
                if (userGuess < minRange || userGuess > maxRange) {
                    System.out.println("Your guess is out of the valid range. Please guess between " + minRange
                            + " and " + maxRange + ".");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Try a higher number. Attempts left: " + (numberofAttempt - attempts));
                } else if (userGuess > numberToGuess) {
                    System.out.println("Try a lower number. Attempts left: " + (numberofAttempt - attempts));
                } else {
                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                    hasGuessedCorrectly = true;
                    score++;
                }
            }
            if(hasGuessedCorrectly){
                System.out.println("You've run out of attempts. The correct number was:" +numberToGuess);
            }
            System.out.println("your current score:"+score);
            System.out.println("Do you want to play again?(yes/no):");
            String playAgainInput=scanner.next().toLowerCase();
            playAgain=playAgainInput.equals("yes");

            }
            System.out.println("thanks for playing! your score is:"+ score);

        }
    }
