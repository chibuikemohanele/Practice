package SherlockInAmerica;

/**
 * GameTest.java
 * Driver program for the Sherlock game.
 * @author Cameron and Chibui
 * @version 1.0
 */

import java.util.Scanner;
public class GameTest {
    public static void main (String[] args) {
        System.out.print ("\f");

        Scanner scan = new Scanner(System.in);

        ShoppingMall shoppingmallTest = new ShoppingMall("shoppingmall");

        Character sherlock = new Sherlock("Sherlock");

        Character criminal = new Criminal("Criminal");

        Riddle riddleTest = new Riddle("riddle");

        System.out.println ("Welcome to Sherlock's Shopping Mall Criminal Case!\n\nYou are Sherlock. The criminal"
            + " you are chasing is currently hiding in a store.\nEach turn, you will be given a riddle, "
            + "if you solve it, you will be\ngiven the slogan for the store housing the criminal.\nIf "
            + "you can name the correct store, you have found the criminal and you win!\nIf you answer"
            + " the riddle or store hint incorrectly, the criminal will\nchange locations and you will"
            + " spend another turn.\n(the criminal will never return to a store he has already visited)."
            + "\n\nGame Objective: Find the criminal in the least amount of turns possible. Good luck!\n");

        int numTurns = 1;
        String answerRiddle, answerHint;
        boolean cont = true;
        int fightOrFlight = 0;

        while (cont) { 
            System.out.println ("What is this answer to this riddle?");
            System.out.print (riddleTest.getRandomRiddleQuestion() + "\nAnswer: ");
            answerRiddle = scan.nextLine();
            System.out.print ("\n");
            if (answerRiddle.equalsIgnoreCase(riddleTest.getRandomRiddleAnswer())) {
                System.out.println ("Correct, you solved the riddle. Answer the correct store for\nthis slogan"
                    + " and you'll find the criminal.");
                System.out.print (shoppingmallTest.getRandomMallQuestion() + "\nAnswer: ");
                answerHint = scan.nextLine();
                System.out.print ("\n");
                if (answerHint.equalsIgnoreCase(shoppingmallTest.getRandomMallAnswer())) {
                    System.out.println ("Correct, you found the criminal at " + answerHint + "!\n");
                    System.out.println ("The criminal is cornered and is going to fight.\n");
                    sherlock.setSherlockLife(25);
                    criminal.setCriminalLife(25);
                    fightOrFlight = ((Sherlock)sherlock).fight();
                    if (fightOrFlight == -1) {
                        System.out.println ("It took you " + numTurns + " turn(s). The game is over.");
                        cont = false;
                    }
                }
                else {
                    System.out.println ("Incorrect. Turn #" + numTurns + " is over. The criminal has"
                        + " changed locations.\n");
                }
                shoppingmallTest.removeRandomMall();
            }
            else {
                System.out.println ("Incorrect. Turn #" + numTurns + " is over. The criminal has "
                    + "changed locations.\n");
            }
            riddleTest.removeRandomRiddle();
            numTurns++;
            if ((numTurns > 10) && (fightOrFlight != -1)) {
                System.out.println ("You reached the max number of turns (10). The criminal escaped. You lose.");
                cont = false;
            }
        }
    }
}