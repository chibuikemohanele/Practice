/**************
 * @author Chibuikem Ohanele
 * Sales.java
 * Tracking Sales
 * @version 1.0
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.print("How many sales people are there?: ");
        int salespeople = scan.nextInt();
        int[] sales = new int[salespeople];
        double sum;
        double average;
        int max = Integer.MIN_VALUE;
        int personMin = 0;
        int personMax = 0;
        int min = Integer.MAX_VALUE;
        for (int i=0; i < sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1)  + ": ");
            sales[i] = scan.nextInt();
            if (sales[i] > max){
                max = sales[i];
                personMax = (i + 1);
            }
            if (sales[i] < min){
                min = sales[i];
                personMin = (i + 1);
            }
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i < sales.length; i++)
        {
            System.out.println("\t " + (i + 1) + "\t\t\t" + sales[i]);
            sum += sales[i];
        }
        System.out.println("The minimum value was " + fmt.format(min) + " by salesperson " + personMin);
        System.out.println("The maximum value was " + fmt.format(max) + " by salesperson " + personMax);
        System.out.println("\nAverage sales: " + fmt.format((double)(sum / salespeople)));
        System.out.println("\nTotal sales: " + fmt.format(sum));
    }
}