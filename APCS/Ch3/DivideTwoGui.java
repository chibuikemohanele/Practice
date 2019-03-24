/****************
 * DivideTwoGui.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Introduce the flow of control statements that are common to every programming language.
 *****************/
import javax.swing.*;

public class DivideTwoGui
{
    public static void main(String[] args)
    {
        String input;
        JOptionPane.showMessageDialog(null, "This program divides two numbers.");
        input = JOptionPane.showInputDialog("Enter the numerator:");
        int numerator = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter the denominator:");
        int denominator = Integer.parseInt(input);
        
        if (denominator != 0){
            JOptionPane.showMessageDialog(null, numerator + "/" + denominator + " = " +
                (double) numerator/denominator);}
        else {System.out.println ("Division by zero is not allowed.");}

            System.exit(0);
        }
    }