import java.util.Scanner;
/**********************************************************************
 * @author Chibuikem Ohanele
 * BlackJack.java
 * Tester program to shuffle and deal a deck of Card objects
 * @version 1.0
 **********************************************************************/

public class BlackJack
{ 
    public static void main (String[] args) 
    { 
        DeckOfCards myDeckOfCards = new DeckOfCards(); 
        myDeckOfCards.shuffle(); // put Card objects in random order 

        Scanner scan = new Scanner(System.in);
        String response;
        Card deal1 = myDeckOfCards.dealCard();
        Card deal2 = myDeckOfCards.dealCard();
        Card player1 = myDeckOfCards.dealCard();
        Card player2 = myDeckOfCards.dealCard();
        int score = (player1.getValue()+player2.getValue());
        int dealerScore = (deal1.getValue() + deal2.getValue());
        System.out.println("The dealer's card is: " + deal1.toString());
        System.out.println("\nYour cards are: "+player1+"\n\t\t"+player2);
        System.out.println("Your total value is: "+ score);

        if(score == 21)
            System.out.println("You win!");
        else{
            System.out.println("\nStay or Hit?");
            if (scan.next().equalsIgnoreCase("hit")){
                Card player3 = myDeckOfCards.dealCard();
                score += player3.getValue();
                if(score > 21)
                    System.out.println("You bust!");
                else{
                    System.out.println("You got: " + player3.toString());
                    System.out.println("Your score is now: " + score);
                    if(score > 21)
                        System.out.println("You bust!");
                    else
                        System.out.println("\nStay or Hit?");
                    if (scan.next().equalsIgnoreCase("hit")){
                        Card player4 = myDeckOfCards.dealCard();
                        score += player4.getValue();
                        System.out.println("You got: " + player4.toString());
                        System.out.println("Your score is now: " + score);
                        if(score > 21)
                            System.out.println("You bust!");
                        else
                            System.out.println("\nStay or Hit?");
                        if (scan.next().equalsIgnoreCase("hit")){
                            Card player5 = myDeckOfCards.dealCard();
                            score += player5.getValue();
                            System.out.println("You got: " + player5.toString());
                            System.out.println("Your score is now: " + score);

                        }
                    }
                }
            }
            else{
                if (dealerScore < 17){
                    Card deal3 = myDeckOfCards.dealCard();
                    dealerScore += deal3.getValue();
                    if (dealerScore < 17){
                        Card deal4 = myDeckOfCards.dealCard();
                        dealerScore += deal4.getValue();
                    }
                    if (dealerScore < 17){
                        Card deal5 = myDeckOfCards.dealCard();
                        dealerScore += deal5.getValue();
                    }
                    if(dealerScore > 21)
                        System.out.println("The dealer busts!");
                }}
            if(score > dealerScore && score < 22){
                System.out.println("\n=====================================================");
                System.out.println("Congratulations, you win!");
                System.out.println("Your score is: " + score);
                System.out.println("The dealers score was: " + dealerScore);
            }
            else if (dealerScore > score && dealerScore < 22){
                System.out.println("You lost.");
                System.out.println("Your score is: " + score);
                System.out.println("The dealers score was: " + dealerScore);

            }

        }

    }
}

