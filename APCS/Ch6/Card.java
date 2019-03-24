/**********************************************************************
 * @author Chibuikem Ohanele
 * Card.java 
 * Represents a Card with a face and a suit.
 * @version 1.0
 **********************************************************************/
public class Card
{
    private String face;
    private String suit;
    private int value;
    public Card (String cardFace, String cardSuit)
    {
        int cardValue = 0;
        face = cardFace;
        suit = cardSuit;
        if (face.equalsIgnoreCase("deuce"))
            cardValue = 2;
        if (face.equalsIgnoreCase("three"))
            cardValue = 3;
        if (face.equalsIgnoreCase("four"))
            cardValue = 4;
        if (face.equalsIgnoreCase("five"))
            cardValue = 5;
        if (face.equalsIgnoreCase("six"))
            cardValue = 6;
        if (face.equalsIgnoreCase("seven"))
            cardValue = 7;
        if (face.equalsIgnoreCase("eight"))
            cardValue = 8;
        if (face.equalsIgnoreCase("nine"))
            cardValue = 9;
        if (face.equalsIgnoreCase("ace"))
            cardValue = 11;
        if (face.equalsIgnoreCase("ten"))
            cardValue = 10;
        if (face.equalsIgnoreCase("king"))
            cardValue = 10;
        if (face.equalsIgnoreCase("queen"))
            cardValue = 10;
        if (face.equalsIgnoreCase("jack"))
            cardValue = 10;
        value = cardValue;
    }

    public String toString()
    {
        return face;
    }
    
    public int getValue(){
        return value;
    }
}