import java.util.Scanner;
public class TransferTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account3 acct1 = new Account3("John");
        Account3 acct2 = new Account3("Sally");
        int z = 1;
        while (z != 0) {

            System.out.println("1 – Transfer from John to Sally’s account.");
            System.out.println("2 – Transfer from Sally to John’s account.");
            System.out.println("3 - Quit");
            System.out.println("Enter a number to choose from the options above: ");
            int x = scan.nextInt();

            if (x == 1) {
                System.out.println("\nHow much would you like to transfer to Sally's account? ");
                double y = scan.nextDouble();
                acct1.transfer(acct2, y);
                System.out.println("\n" + acct1 + "\n" + acct2);
                z++;
            }
            else if (x == 2) {
                System.out.println("\nHow much would you like to transfer to John's account? ");
                double y = scan.nextDouble();
                acct2.transfer(acct1, y);
                System.out.println("\n" + acct1 + "\n" + acct2);
                z++;
            }
            else {
                System.out.println("End of program");
                z = 0;
            }
        }    

        System.out.println();
        System.out.println("***** Testing static transfer method *****");
        int k = 1;
        
        while (k != 0) {

            System.out.println("1 – Transfer from John to Sally’s account.");
            System.out.println("2 – Transfer from Sally to John’s account.");
            System.out.println("3 - Quit");
            System.out.println("Enter a number to choose from the options above: ");
            int x = scan.nextInt();

            if (x == 1) {
                System.out.println("\nHow much would you like to transfer to Sally's account? ");
                double y = scan.nextDouble();
                Account3.transfer(acct1, acct2, y);
                System.out.println("\n" + acct1 + "\n" + acct2);
                k++;
            }
            else if (x == 2) {
                System.out.println("\nHow much would you like to transfer to John's account? ");
                double y = scan.nextDouble();
                Account3.transfer(acct2, acct1, y);
                System.out.println("\n" + acct1 + "\n" + acct2);
                k++;
            }
            else {
                System.out.println("End of program");
                k = 0;
            }
        }    
    }
}
        
       