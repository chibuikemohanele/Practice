/**
 * TransferTest.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Does transfer stuff.
 */
import java.util.Scanner;
public class TransferTest{
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        Account acct1 = new Account(1000, "John");
        Account acct2 = new Account(1000, "Sally");
        Account acct3 = new Account(1000, "Mike");
        Account acct4 = new Account(1000, "Jill");
        String response;
        double amount;
        boolean quit = true;
        boolean cancel = true;

        while(quit){
            System.out.print("Would you like to transfer funds from " + acct1.getName() + " to " 
                + acct2.getName() + ", transfer funds from " + acct2.getName() + " to "
                + acct1.getName() + "\n or quit?(Type J,S, or Q): ");
            response = scan.next();
            System.out.println();
            if (response.substring(0,1).equalsIgnoreCase("J")){
                System.out.print("How much would you like to transfer?: ");
                amount = scan.nextDouble();
                while(amount > acct1.getBalance()){
                    if(amount > acct1.getBalance()){
                        System.out.print("Insufficient funds, please type another amount in: ");
                        amount = scan.nextDouble();
                    }
                }
                acct1.transfer(acct2, amount);
                System.out.println();
                System.out.println(acct1.toString());
                System.out.println();
                System.out.println(acct2.toString());
                System.out.println();
            }
            else
            if (response.substring(0,1).equalsIgnoreCase("S")){
                System.out.print("How much would you like to transfer?: ");
                amount = scan.nextDouble();
                while(amount > acct2.getBalance()){
                    if(amount > acct2.getBalance()){
                        System.out.print("Insufficient funds, please type another amount in: ");
                        amount = scan.nextDouble();
                    }
                }
                acct2.transfer(acct1, amount);
                System.out.println();
                System.out.println(acct1.toString());
                System.out.println();
                System.out.println(acct2.toString());
                System.out.println();
            }
            else{
                quit = false;
                System.out.println(acct1.toString());
                System.out.println();
                System.out.println(acct2.toString());
            }
        }

        System.out.println();
        System.out.println("******Testing static transfer method*****");
        while(cancel){
            System.out.print("Would you like to transfer funds from " + acct3.getName() + " to " 
                + acct4.getName() + ", transfer funds from " + acct4.getName() + " to "
                + acct3.getName() + "\n or quit?(Type M, J, or Q): ");
            response = scan.next();
            System.out.println();
            if (response.substring(0,1).equalsIgnoreCase("M")){
                System.out.print("How much would you like to transfer?: ");
                amount = scan.nextDouble();
                while(amount > acct3.getBalance()){
                    if(amount > acct3.getBalance()){
                        System.out.print("Insufficient funds, please type another amount in: ");
                        amount = scan.nextDouble();
                    }
                }

                Account.transfer(acct3,acct4,amount);
                System.out.println();
                System.out.println(acct3.toString());
                System.out.println();
                System.out.println(acct4.toString());
                System.out.println();
            }
            else
            if (response.substring(0,1).equalsIgnoreCase("J")){
                System.out.print("How much would you like to transfer?: ");
                amount = scan.nextDouble();
                while(amount > acct4.getBalance()){
                    if(amount > acct4.getBalance()){
                        System.out.print("Insufficient funds, please type another amount in: ");
                        amount = scan.nextDouble();
                    }
                }
                Account.transfer(acct4,acct3,amount);
                System.out.println();
                System.out.println(acct3.toString());
                System.out.println();
                System.out.println(acct4.toString());
                System.out.println();
            }
            else{
                cancel = false;
                System.out.println(acct3.toString());
                System.out.println();
                System.out.println(acct4.toString());
            }
        }
    }
}