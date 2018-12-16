public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account(1000, "John", 1234);
        acct1.deposit(100);
        acct1.withdraw(500);
        System.out.println("\n" + acct1.toString() + "\n");
       
        Account acct2 = new Account("Sally");
        acct2.deposit(5000);
        acct2.withdraw(150, 2.50);
        acct2.withdraw(5000);
        System.out.println("\n" + acct2.toString() + "\n");
        
        Account acct3 = new Account(5500, "Tommy");
        acct3.withdraw(500);
        System.out.println("\n" + acct3.toString() + "\n");
        
    }
}
       