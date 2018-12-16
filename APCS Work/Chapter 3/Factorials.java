/***************
 * Factorials.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Prints factorials when user puts in a number.
 ***************/
import java.util.Scanner;
public class Factorials{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        int user;
        int input;
        int total = 1;
        System.out.print ("Enter a number to print its factorial: ");
        user = scan.nextInt();
        input = user;
        if (input == 0){
            total = 1;
        }
        else{
            while (user < 0){
                System.out.println ("The number you entered is less than 0. " +
                    "Please enter a nonnegative number: ");
                user = scan.nextInt(); 

            }  
            while (user > 0){
                if (user > 0){
                    total *= user;
                    user--;
                }
            }

        }
        System.out.println ("The factorial of " + input + " is " + total + ".");
    }
}
