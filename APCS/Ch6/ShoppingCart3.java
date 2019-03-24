/*******************************************************************
 * @author Chibuikem Ohanele
 * ShoppingCart3.java
 * Represents a shopping cart as an array of items
 * @version 1.0
 **********************************************************************/
 import java.util.ArrayList; 
 import java.text.NumberFormat;
public class ShoppingCart3
{
    private int itemCount; // total number of items in the cart
    private double totalPrice; // total price of items in the cart
    private int capacity; // current cart capacity
    private ArrayList<Item> cart;
    
    // -----------------------------------------------------------
    // Creates an empty shopping cart with a capacity of 5 items.
    // -----------------------------------------------------------
    public ShoppingCart3()
    {
        capacity = 2;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new ArrayList<Item>();
    }
    // -------------------------------------------------------
    // Adds an item to the shopping cart.
    // -------------------------------------------------------
    public void addToCart(String itemName, double price, int quantity)
    {
        totalPrice += (price * quantity);
        
        Item temp = new Item (itemName, price, quantity);
        cart.add(temp);
        itemCount++;
    }
    // -------------------------------------------------------
    // Returns the contents of the cart together with
    // summary information.
    // -------------------------------------------------------
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping Cart\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
        for (int i = 0; i < itemCount; i++)
            contents += cart.get(i).toString() + "\n";
        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }
    
    public double getTotalPrice(){
        return totalPrice;
    }
}