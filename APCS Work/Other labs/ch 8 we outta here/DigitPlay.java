// *******************************************************************
// DigitPlay.java
//
// Finds the number of digits in a positive integer.
// *******************************************************************
import java.util.Scanner;
public class DigitPlay
{
    public static void main (String[] args)
    {
        int num; //a number
        Scanner scan = new Scanner(System.in);
        System.out.println ();
        System.out.print ("Please enter a positive integer: ");
        num = scan.nextInt ();

        if (num <= 0)
            System.out.println ( num + " isn't positive -- start over!!");
        else
        {
            // Call numDigits to find the number of digits in the number
            // Print the number returned from numDigits
            System.out.println ("\nThe number " + num + " contains " +
                + numDigits(num) + " digits.");
            System.out.println ();
        }

        System.out.println("Renter the number you just entered to check if it is Divisible by Seven");
        num = scan.nextInt();

        while (num > 0)
        {

            System.out.println ("\nThe number " + num + " contains " +
                + numDigits(num) + " digits.");
            System.out.println ("The sum is " + sumDigits(num));
            if ((sumDigits(num)%7) == 0)
                System.out.println (num + "---ok");
            else
                System.out.println (num + "---error");

            System.out.println("Input another postive number to check, or enter a negative number to quit");
            num = scan.nextInt();    
        }

    }
    // -----------------------------------------------------------
    // Recursively counts the digits in a positive integer
    // -----------------------------------------------------------
    public static int numDigits(int num)
    {
        if (num < 10)
            return (1);
        else
            return (1 + numDigits(num/10));
    }

    public static int sumDigits(int num)
    {
        if (num < 10)
            return (1);
        else
            return ((num%10) + sumDigits(num/10));
    }
}