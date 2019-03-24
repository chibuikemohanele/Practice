/**********************
 * Rock.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Plays rock, paper, scissors 
 **********************/
import java.util.Scanner;

public class Rock{

    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = "U";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number for computer play
        String yes1;
        int counter = 0;
        int counter2 = 0;

        Scanner scan = new Scanner(System.in);
        while (counter < 1){        
            System.out.print ("What do you want to play? (R, P, or S): ");
            personPlay = scan.nextLine();
            personPlay = personPlay.toUpperCase();

            computerInt = (int)(Math.random() * 3);
            //Translate computer's randomly generated play to string
            if (personPlay.equals("R")||personPlay.equals("S")||personPlay.equals("P")){
                if (computerInt == 0){
                    computerPlay = "R";}

                else if (computerInt == 1){
                    computerPlay = "P";}

                else if (computerInt == 2){
                    computerPlay = "S";}}
            if (!computerPlay.equals("U")){
                System.out.println ("The computer's play is: " + computerPlay);}
            else System.out.println ("Input is invalid");

            //See who won.  Use nested ifs instead of &&.
            if (personPlay.equals(computerPlay))  
                System.out.println("It's a tie!");
            if (personPlay.equals("R")){
                if (computerPlay.equals("S"))
                    System.out.println("Rock crushes scissors.  You win!!");}
            if (personPlay.equals ("R")){
                if (computerPlay.equals("P"))
                    System.out.println("Rock loses to paper. You lose!");}
            if (personPlay.equals("P")){
                if (computerPlay.equals("R"))
                    System.out.println("Paper covers rock. You Win!!");}
            if (personPlay.equals ("P")){
                if (computerPlay.equals("S"))
                    System.out.println("Paper gets cut up by scissors. You lose!!");}
            if (personPlay.equals("S")){
                if (computerPlay.equals("P"))
                    System.out.println ("Scissors cuts up paper. You Win!!");}
            if (personPlay.equals ("S")){
                if (computerPlay.equals("R"))
                    System.out.println ("Scissors gets smashed by rock. You lose.");}
            counter2 = 0;

            while (counter2 < 1){
                System.out.println ("Do you want to continue playing? (Y/N): ");
                yes1 = scan.nextLine();
                yes1 = yes1.toUpperCase();
                if (yes1.equals("N")){
                    System.out.println ("Thank you for playing! Have a great day!");
                    counter++;
                    counter2++;}
                else if (yes1.equals ("Y")){
                    System.out.println ("Thanks for continuing.");
                    counter2++;}
                else System.out.println ("Invalid answer.");
            }

        }
    }
}
