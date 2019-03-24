import java.util.Scanner;
public class AccountTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many accounts will you be creating? ");
        int x = scan.nextInt();
        int y = 1;
        while (y <= x) {
            System.out.print("Enter the name for account #" + y + ": ");
            String name = scan.next();
            Account2 acct = new Account2(100, name);
            System.out.println(acct.toString());
            System.out.println("Next ID number: " + Account2.getNextNum());
            
            System.out.println();
            y++;
            
        }
        
        System.out.println("End of program. Hasta luego.");
    }
}
          
            