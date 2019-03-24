/****************
 * Dice.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Simulates rolling of a pair of dice
 ****************/
public class Dice{
    public static void main (String[] args){
        System.out.println ('\f');
        
        int randomNum1 = (int)((Math.random() * 6) + 1);
        int randomNum2 = (int)((Math.random() * 6) + 1);

        System.out.print ("The first dice rolled a: " + randomNum1);

        System.out.println ();
        System.out.println ();

        System.out.print ("The second dice rolled a: " + randomNum2);

        System.out.println ();
        System.out.println ();

        System.out.print ("The number of the first dice plus " +
            "\nthe number of the second dice is: " + (randomNum1 + randomNum2));

    }
}