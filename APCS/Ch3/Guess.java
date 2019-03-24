/*****************
 * Guess.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * User inputs a value to guess the random number the computer generated.
 *****************/
import java.util.Scanner;
import java.util.Random;

public class Guess
{
    public static void main(String[] args)
    {
        int numToGuess;       //Number the user tries to guess
        int guess;            //The user's guess
        int highguess = 0;
        int lowguess = 0;
        int totalguess;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        numToGuess = (int)((Math.random() * 10) + 1);//randomly generate the  number to guess

        System.out.print ("Enter your guess: ");//print message asking user to enter a guess
        guess = scan.nextInt();

        //read in guess

        while (guess != numToGuess  )  //keep going as long as the guess is wrong
        {
            System.out.println ("The number you entered is wrong.");//print message saying guess is wrong
            
            if (guess > numToGuess){
                System.out.println ("Your guess was too high.");
                 highguess++;}
            else {
                System.out.println ("Your guess was too low.");
                lowguess++;}
                
            System.out.print ("Try again: ");//get another guess from the user
            guess = scan.nextInt();
            
        }
        totalguess = highguess + lowguess;
        System.out.println ("You guessed " + highguess + " high guesses.");
        System.out.println ("You guessed " + lowguess + " low guesses.");
        System.out.println ("You guessed " + totalguess + " guesses in total.");
        System.out.println ("The guess you entered is correct. Great job!");//print message saying guess is right
    }
}
