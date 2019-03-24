import java.util.Scanner;
/**
 * AccountTest.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Does stuff with account objects
 **/
public class AccountTest{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        Account acct1 = new Account(1000, "John", 1234);
        Account acct2 = new Account("Sally");
        Account acct3 = new Account(5500,"Tommy");
        
        acct1.deposit(100);
        acct1.withdraw(500);
        System.out.println(acct1.toString());
        
        System.out.println();
        
        acct2.deposit(5000);
        acct2.withdraw(150, 2.50);
        System.out.println();
        acct2.withdraw(5000);
        System.out.println();
        System.out.println(acct2.toString());
        
        System.out.println();
        
        acct3.withdraw(500);
        System.out.println(acct3.toString());
    }
}