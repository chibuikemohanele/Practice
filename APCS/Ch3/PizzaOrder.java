/******************
 *PizzaOrder.java
 *@author Chibuikem Ohanele
 *@version 1.0
 *This program allows the user to order a pizza
 *******************/
import java.util.Scanner;
import java.text.NumberFormat;

public class PizzaOrder
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);

        String firstName;                  
        boolean discount = false;           
        int inches;                         
        char crustType;                     
        String crust = "Hand-tossed";       
        double cost = 12.99;                
        final double TAX_RATE = .08;        
        double tax;                         
        char choice;                        
        String input;                       
        String toppings = "Cheese ";        
        int numberOfToppings = 0;           

        System.out.println("Welcome to Mike and Diane's Pizza");
        System.out.print("Enter your first name:  ");
        firstName = scan.nextLine();

        if (firstName.equalsIgnoreCase("Diane") || firstName.equalsIgnoreCase("Mike")){
            //if (firstName.equals("Mike") || firstName.equals("Diane"))
            discount = true;//ADD LINES HERE FOR TASK #1
        }

        System.out.println("Pizza Size (inches)   Cost");
        System.out.println("        10            $10.99");
        System.out.println("        12            $12.99");
        System.out.println("        14            $14.99");
        System.out.println("        16            $16.99");
        System.out.println("What size pizza would you like? ");
        System.out.print("10, 12, 14, or 16 (enter the number only): ");
        inches = scan.nextInt();

        if (inches == 10){
            cost = 10.99;}
        else if (inches == 12){
            cost = 12.99;}
        else if (inches == 14){
            cost = 14.99;}
        else if (inches == 16){
            cost = 16.99;}
        else {
            inches = 12;
            cost = 12.99;
            System.out.println("User input was not one of the choices. So a 12 inch pizza will be made.");}

        System.out.println("What type of crust do you want? ");
        System.out.print("(H)Hand-tossed, (T) Thin-crust, or " +
            "(D) Deep-dish (enter H, T, or D): ");
        input = scan.next();
        crustType = input.charAt(0);
        if (crustType == 'T'){
            crust = "Thin-Crust" ;}
        if (crustType == 'D'){
            crust = "Deep Dish";}

        System.out.println("All pizzas come with cheese.");
        System.out.println("Additional toppings are $1.25 each,"
            +" choose from");
        System.out.println("Pepperoni, Sausage, Onion, Mushroom");

        System.out.print("Do you want Pepperoni?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Pepperoni ";
        }
        System.out.print("Do you want Sasuage?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Sasuage ";
        }
        System.out.print("Do you want Onions?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Onions ";
        }
        System.out.print("Do you want Mushrooms?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Mushrooms ";
        }

        cost = cost + (1.25*numberOfToppings);

        System.out.println();
        System.out.println("Your order is as follows: ");
        System.out.println(inches + " inch pizza");
        System.out.println(crust + " crust");
        System.out.println(toppings);

        if (discount){
            System.out.println ("You are eligible for a discount of $2.00!!");
            cost = cost - 2;}

        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();

        System.out.println("The cost of your order is: " + money.format(cost));

        tax = cost * TAX_RATE;
        System.out.println("The tax is:  " + money.format(tax) + " at " + percent.format(TAX_RATE));
        System.out.println("The total due is:  " + money.format(tax+cost));

        System.out.println("Your order will be ready for pickup in 30 minutes.");
    }
}