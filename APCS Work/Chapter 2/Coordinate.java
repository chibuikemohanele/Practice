/***************
 * Distance.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Finds the distance between two objects
 ****************/
 import java.util.Scanner;
public class Coordinate{
    public static void main (String[] args){
        Scanner points = new Scanner (System.in);
        double x1;
        double x2;
        double y1;
        double y2;
        double distance;

        System.out.print ("\f");
        System.out.print ("What is x1: ");
        x1 = points.nextDouble ();

        System.out.println ();

        System.out.print ("What is x2: ");
        x2 = points.nextDouble ();

        System.out.println ();

        System.out.print ("What is y1: ");
        y1 = points.nextDouble ();

        System.out.println ();

        System.out.print ("What is y2: ");
        y2 = points.nextDouble ();

        System.out.println ();

        distance = Math.sqrt (((x1-x2) * (x1-x2)) + ((y1-y2) * (y1-y2)));
        System.out.println ("Distance between the points is: " + distance);

    }
}