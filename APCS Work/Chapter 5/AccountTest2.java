/**
 * AccountTest2.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Does stuff with a second account.
 */
import java.util.Scanner;
public class AccountTest2{
    public static void main (String []args){
        System.out.println("\f");
        Scanner scan = new Scanner(System.in);
        int numAccounts;
        String accountName;
        int accountBalance;
        Account acct;
        System.out.print("How many accounts would you like to create?: ");
        numAccounts = scan.nextInt();
        System.out.println();
        for(int i = 0; i < numAccounts; i++){
            System.out.print("Enter the name of account number #" + (i + 1) + "?: ");
            accountName = scan.next();
            System.out.print("What is " + accountName + "'s balance?: ");
            accountBalance = scan.nextInt();
            acct = new Account(accountBalance, accountName);
            System.out.println(accountName + "'s number is: " + acct.retrievenextAcctNum()
                                + ". The balance is $" + acct.getBalance() + ".");
            System.out.println("The next id number is: " + Account.getnextAcctNum());
            System.out.println();
        }
        System.out.println("End of program. Goodbye.");
    }
}