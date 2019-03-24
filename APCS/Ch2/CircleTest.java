/********************************
 * CircleTest.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Calculates area and circumference
 ********************************/

import java.util.Scanner;
public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r1 = scan.nextDouble();
        Circle circle1 = new Circle(r1);
        double area1 = circle1.getArea();
        System.out.println("radius = " + r1 + " area = " + area1);
        double circumference1 = circle1.getCircumference();
        System.out.println("circumference = " + circumference1);
        
        System.out.println("\n");

        Scanner stan = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r2 = scan.nextDouble();
        Circle circle2 = new Circle(r2);
        double area2 = circle2.getArea();
        System.out.println("radius = " + r2 + " area = " + area2);
        double circumference2 = circle2.getCircumference();
        System.out.println("circumference = " + circumference2);

    }
}
