import java.util.Scanner;
public class Card implements Comparable{
    private String face;
    private String suit;
    Scanner scan = new Scanner(System.in);
    public Card(){
        setFaceCard();
    }

    public String getFace(){
        return face;
    }

    public String getSuit(){
        return suit;
    }

    public void setFaceCard(){
        System.out.println("What is the face of your card?");
        String f = scan.next();
        face = f;
        System.out.println("What is the suit of your card?");
        String s = scan.next();
        suit = s;
    }

    public static boolean sameSuit(Card a, Card b){
        if (a.getSuit().equals(b.getSuit()))
            return true;
        return false;
    }

    public int compareTo(Object o){
        Card x = (Card) o;
        if(this.getFace().length() == 3){
            if (x.getFace().length()==3)
                return 0;
            else 
                return -1;
        }
        if(this.getFace().length() > 3){
            if (x.getFace().length() > 3)
                return 0;
            else
            if(x.getFace().length() < 3)
                return -1;
            else 
                return 1;
        }
        if(this.getFace().length() < 3){
            if(x.getFace().length() < 3)
                return 0;
            else
            if(x.getFace().length() > 3)
                return -1;
        }
        return 0;
    }
}