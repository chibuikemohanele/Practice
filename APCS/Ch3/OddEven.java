/**************
 * OddEven.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Asks the user for a positive integer and prints the number of odd, even, and zero digits.  
 *************/
import java.util.Scanner;
public class OddEven{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int response;
        int totaleven = 0;
        int totalodd = 0;
        int totalzero = 0;

        System.out.print ("Please enter a positive interger: ");
        response = scan.nextInt();
        while (response < 0){
            System.out.print ("The input invalid. Please enter a POSITIVE number: ");
            response = scan.nextInt();}
        while (response > 0){
            if ((response % 2) == 0)
                totaleven++;
            else if ((response % 10) == 0)
                totalzero++;
            else 
                totalodd++;
            response /= 10;
        }
        if (totaleven == 1){
            System.out.println ("There is " + totaleven + " even digit");}
        else{
            System.out.println ("There are " + totaleven + " even digits.");}
        if (totalodd == 1){
            System.out.println ("There is " + totalodd + " odd digit");}
        else{
            System.out.println ("There are " + totalodd + " odd digits.");}
        if (totalzero == 1){
            System.out.println ("There is " + totalzero + " zero digit");}
        else{
            System.out.println ("There are " + totalzero + " zero digits.");}
    }
}
