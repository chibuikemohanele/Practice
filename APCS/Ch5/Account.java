/**
 * Account.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Account that does stuff
 */

public class Account
{
    private double balance;
    private String name;
    private int acctNum;
    private static int nextAcctNum = 1000;
    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String owner, int number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
        nextAcctNum = number;
    }
    
      public Account(double initBal, String owner)
    {
        balance = initBal;
        name = owner;
        acctNum = nextAcctNum;
        nextAcctNum++;
    }
    
      public Account(String owner)
    {
        int initBal = 0;
        balance = initBal;
        name = owner;
        acctNum = ((int)(Math.random() * 9000) + 1000);
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
        //System.out.println("Withdraw $" + amount + " from " + name + "'s account. New balance is $" 
        //                    + balance + ".");
    }
    
    public void withdraw(double amount, double amountFee)
    {
        if (balance >= amount + amountFee)
            balance -= amount + amountFee;
        else
            System.out.println("Insufficient funds");
        System.out.println("Withdraw $" + amount + " plus $" + amountFee + " from " + name + "'s account."
                            + " New balance is $" + balance + ".");
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
    
    public int getAcctNum(){
        return acctNum;
    }
    //----------------------------------------------
    // Returns account name.
    //----------------------------------------------
    public String getName()
    {
        return name;
    }
    
    public static int getnextAcctNum(){
       return nextAcctNum++ + 1;
    }
    
    public int retrievenextAcctNum(){
        return nextAcctNum;
    }
    
    public String toString(){
        return name + "'s account." + "\nAccountNumber: " + this.getAcctNum()  + "\nBalance: " + balance;
    }
    
    
    public void transfer (Account acct, double amount){
        this.withdraw(amount, 0);
        acct.deposit(amount);
        System.out.println("Transferred $" + amount + " from " + this.getName() + "'s to "
                            + acct.getName() + "'s account.");
    }
    
    public static void transfer(Account acct1, Account acct2, double amount){
        acct1.withdraw(amount, 0);
        acct2.deposit(amount);
        System.out.println("Transferred $" + amount + " from " + acct1.getName() + "'s to "
                            + acct2.getName() + "'s account.");
    }
}