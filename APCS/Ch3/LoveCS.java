/**********************
 * LoveCS.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Prints the words I love computer science multiple times
 **********************/
import java.util.Scanner;
public class LoveCS{
    public static void main(String[] args){
        int response;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many times should the message be printed?: ");
        response = scan.nextInt();
        int numberline = 1;
        int count = 1;
        int totalnumberline = 0;
        while (count <= response){
            System.out.println(count + " I love Computer Science!!");
            totalnumberline += count;
            count++;}
        System.out.println ("The message was printed " + response + " times.");
        System.out.println ("The sum of the numbers from 1 to " + (count - 1) + " is " + (totalnumberline) + ".");
    }
}
