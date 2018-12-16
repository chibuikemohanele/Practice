public class Account2
{
    private double balance;
    private String name;
    private int acctNum;
    private static int nextAcctNum = 1000;
    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account2(double initBal, String owner, int number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
    }
    
    public Account2(double initBal, String owner)
    {
        balance = initBal;
        name = owner;
        acctNum = nextAcctNum;
        nextAcctNum++;
    }
    
    public Account2(String owner) 
    {
        balance = 0;
        name = owner;
        acctNum = nextAcctNum;
        nextAcctNum++;
    }
    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount)
    {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw $" + amount + " from " + name + "'s account. " + 
                                "New balance is $" + getBalance());
                            }
        else
            System.out.println("Insufficient funds");
    }
    
    public void withdraw(double amount, double fee) 
    {
        if (balance + fee >= amount) {
            balance -= amount;
            balance -= fee;
            System.out.println("Withdraw $" + amount + " plus $" + fee + " fee from " + name + "'s account. " + 
                                "New balance is $" + getBalance());
                            }
        else
            System.out.println("Insufficient funds");
        
    }
    
    public static int getNextNum() 
    {
        return nextAcctNum;
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
    // Returns account name.
    //----------------------------------------------
    public String getName()
    {
        return name;
    }
    
    public String toString() 
    {
        return name + "'s account number is " + acctNum + ". Balance is $" + balance + ".";
    }
}
