/************************
 * OddsEvens.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Prints out odd/even numbers.
 *********************/
import java.util.Scanner;
public class OddEvens{
    public static void main (String [] args){
        System.out.print ("\f");
        System.out.println("********Odd or Even*******");
        String word;
        int integer;
        int even = 0;
        int odd = 0;
       

        
        Scanner scan = new Scanner (System.in);
        System.out.print ("Do you want to enter an integer? y/n: ");
        word = scan.nextLine();
        if (word.equalsIgnoreCase("y")){
            System.out.print ("Enter integer: ");
            integer = scan.nextInt();
            if (integer % 2 == 0){
                System.out.println(integer + " is even.");
                even = even + 1; }
            else 
            if (integer != 0){
                System.out.println(integer + " is odd.");
                odd = odd + 1;}
        }
        System.out.print ("\n");
        System.out.print ("Continue? y/n: ");
        word = scan.next();

        while (word.equalsIgnoreCase("y")){
            System.out.print ("Enter integer: ");
            integer = scan.nextInt();
            
            if (integer % 2 == 0){
                       System.out.println(integer + " is even.");
                       even++;}
                else 
                if (integer != 0){
                    System.out.println(integer + " is odd.");
                    odd++;}
            System.out.print ("\n");
            System.out.print ("Continue? y/n: ");
            word = scan.next();
         }
        if (word.equalsIgnoreCase ("n")){
            System.out.println ("You entered " + even + " even and " + odd + " odd numbers.");
            System.out.print ("\n");
            System.out.println ("Good bye!");

        }
    }
}