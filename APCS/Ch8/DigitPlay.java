/******************************************************************
 * @author Chibuikem Ohanele
 * @version 1.0
 * DigitPlay.java
 * Finds the number of digits in a positive integer.
 ******************************************************************/
import java.util.Scanner;
public class DigitPlay
{
    public static void main (String[] args)
    {
        System.out.println("\f");
        int num; //a number
        boolean cont = true;
        Scanner scan = new Scanner(System.in);
        System.out.println ();
        int x = 0;
        int y = 0;
        int z = 0;
        int q = 0;
        /*
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
         */
        while(cont){   
            System.out.print("Enter an identification number or enter -1 to quit: ");
            x = scan.nextInt();
            if (x == -1){
                System.out.println("Goodbye.");
                cont = false;
            }
            else{
                System.out.println(x + test(sumDigits(x)));
            }

        }

        // add loop to prompt user for identification numbers to check.
        // use the following id num’s as test data:
        // 3429072 --- error
        // 1800237 --- ok
        // 88231256 --- ok
        // 3180012 --- error
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

    public static int sumDigits(int num){
        if ( num < 10)
            return (1);
        else 
            return (num%10 + sumDigits(num/10));
    }

    public static String test(int num){
        if ((num % 7) == 0)
            return "---ok";
        else 
            return "---error";
    }
}
