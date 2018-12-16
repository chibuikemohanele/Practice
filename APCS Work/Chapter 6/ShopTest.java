/*************
 * @author Chibuikem Ohanele
 * ShopTest.java
 * Tests for shopping and item class
 * @version 1.0
*************/
import java.util.Scanner;
public class ShopTest{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String name;
        double price;
        int quantity;
        boolean exit = true;
        String response;
        System.out.println("Let's start shopping!");
        
        ShoppingCart shopping = new ShoppingCart();
        while(exit){
            System.out.print("What item do you want to add to the cart?: ");
            name = scan.next();
            System.out.print("What is the price of the item?: ");
            price = scan.nextDouble();
            System.out.print("How many of these items do you want?: ");
            quantity = scan.nextInt();
            shopping.addToCart(name, price, quantity);
            System.out.print("Do you want to continue?: ");
            response = scan.next();
            if (response.substring(0,1).equals("y"))
                 exit = true;
            else 
                exit = false;
        }
    
        System.out.println(shopping.toString());
    
    }
}