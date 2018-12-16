/*******************************************************
 * @author Chibuikem Ohanele
 * Account.java
 * A bank account class with methods to deposit to, withdraw from,
 * change the name on, charge a fee to, and print a summary of the account.
 * @version 1.0
 *******************************************************/
import java.text.NumberFormat;
public class Account{
    private double balance;
    private String name;
    private long acctNum;
    NumberFormat money = NumberFormat.getCurrencyInstance();
    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String owner, long number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount)
    {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount)
    {
        balance += amount;
    }

    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    public double getBalance()
    {
        return balance;
    }

    //----------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //----------------------------------------------
    public String toString()
    {
        return name + "'s balance: " + money.format(balance);
    }

    //----------------------------------------------
    // Deducts $10 service fee
    //----------------------------------------------
    public double chargeFee()
    {
        int chargeFee = 10;
        balance-= chargeFee;
        return balance;

    }

    //----------------------------------------------
    // Changes the name on the account 
    //----------------------------------------------
    public String changeName(String newName)                 
    {
        name = newName;
        return name;
    }
    
    public String getSummary()
    {
        return "Name: " + name + "\n" + "Account Number:" + acctNum + "\n" 
                + "Balance: " + balance;
                
    }

}
