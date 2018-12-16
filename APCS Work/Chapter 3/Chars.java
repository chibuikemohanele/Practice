/***************
 * Chars.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Prints out a message vertically.
 ***************/

import java.util.Scanner;
public class Chars {
    public static void main (String[] args){
        String response;
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.print ("Please enter a string of characters: ");
        response = scan.nextLine();
        for (i = 0; i < response.length(); i++)
            System.out.println (response.charAt(i));

    }
}