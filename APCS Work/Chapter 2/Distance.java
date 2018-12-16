/***************
 * Distance.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Computes the distance between two points
 ****************/
import java.util.Scanner;
public class Distance
{
    public static void main (String[] args)
    {
        double x1, y1, x2, y2; 
        double distance;       
        Scanner scan = new Scanner(System.in);

        System.out.print ("Enter the coordinates of the first point " +
            "(put a space between them): ");
        x1 = scan.nextDouble ();
        y1 = scan.nextDouble ();

        System.out.println ();

        System.out.print ("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble ();
        y2 = scan.nextDouble ();

        distance = Math.sqrt(((x1 - x2) * (x1 -x2)) + ((y1 - y2) * (y1 - y2)));
        System.out.print ("The distance between the two points are: " + distance);

	
    }
}
