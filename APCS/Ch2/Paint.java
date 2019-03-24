/***************************************************************
 * File: Paint.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Purpose: Determine how much paint is needed to paint the walls
 * of a room given its length, width, and height
 **************************************************************/
import java.util.Scanner;

public class Paint
{
    public static void main(String[] args)
    {
        System.out.println ("\f");
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        int length;
        int width;
        int height;
        int doors;
        int windows;
        double totalSqFt;
        double paintNeeded;
        Scanner scan = new Scanner(System.in);

        System.out.print ("Length of the room: ");
        length = scan.nextInt();

        System.out.println();

        System.out.print ("Width of the room: ");
        width = scan.nextInt();

        System.out.println();

        System.out.print ("Height of the room: ");
        height = scan.nextInt();

        System.out.println();

        System.out.print ("How many doors are in the room?: ");
        doors = scan.nextInt();

        System.out.println();

        System.out.print ("How many windows are in the room?: ");
        windows = scan.nextInt();

        System.out.println();

        totalSqFt = (((2 * height * length) + (2 * height * width)) - (20 * doors) - (15 * windows));
        System.out.print ("The total square feet is: " + totalSqFt);

        System.out.println();

        paintNeeded = (totalSqFt / COVERAGE);
        System.out.print ("The amount of paint needed is: " + paintNeeded);

    }
}
