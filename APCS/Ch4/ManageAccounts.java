/****************************************************************
 * @author chibuikem ohanele
 * ManageAccounts.java
 * Use Account class to create and manage Sally and Joe's bank accounts
 * @version 1.0
 ****************************************************************/

public class ManageAccounts
{
    public static void main(String[] args)
    {
        System.out.println("\f");
        Account acct1, acct2;

        //create account1 for Sally with $1000
        acct1 = new Account(1000, "Sally", 1111);

        //create account2 for Joe with $500
        acct2 = new Account (500, "Joe", 2222);
        acct2.deposit(100);//deposit $100 to Joe's account
        System.out.println("Joe's Balance: " + acct2.getBalance()); //print Joe's new balance (use getBalance())
        acct2.withdraw(1000);//withdraw $1000 from Joe’s account

        System.out.println();

        acct1.withdraw(50);//withdraw $50 from Sally's account
        System.out.println("Sally's Balance: " + acct1.getBalance());//print Sally's new balance (use getBalance())
        
        System.out.println();
        
        System.out.println("Service fee charged. Sally's account balance: " + acct1.chargeFee());//charge fees to both accounts
        System.out.println("Service fee charged. Joe's Account balance: " + acct2.chargeFee());

        System.out.println();
        
        acct2.changeName("Joseph");//change the name on Joe's account to Joseph

        System.out.println("Summary for Sally's account" + "\n" + acct1.getSummary());
        
        System.out.println();
        
        System.out.println("Summar for Joseph's account" + "\n" + acct2.getSummary());//print summary for both accounts

    }
}
