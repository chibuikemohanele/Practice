public class Account3
{
    private double balance;
    private String name;
    private int acctNum;
    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account3(double initBal, String owner, int number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    public Account3(double initBal, String owner)
    {
        balance = initBal;
        name = owner;
        acctNum = (int) (Math.random() * 8999 + 100);
    }

    public Account3(String owner) 
    {
        balance = 10000;
        name = owner;
        acctNum = (int) (Math.random() * 9000 + 1000);
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
        return name + "'s account number is " + acctNum + ". Balance is $" + balance + ".\n";
    }

    public void transfer(Account3 acct, double amount) {
        this.withdraw(amount);
        acct.deposit(amount);
        System.out.println("Transferred $" + amount + " from " + this.getName() + "'s account to " +
            acct.getName() + "'s account.\n");
    }

    public static void transfer(Account3 acct1, Account3 acct2, double amount) {
        acct1.withdraw(amount);
        acct2.deposit(amount);
        System.out.println("Transferred $" + amount + " from " + acct1.getName() + "'s account to " +
            acct2.getName() + "'s account.\n");
    }

      
        
        
        
        
}

