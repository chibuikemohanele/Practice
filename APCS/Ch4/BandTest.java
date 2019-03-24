/***********
 * @author Chibuikem Ohanele
 * BandTest.java
 * Does more stuff with methods from BandBooster
 * @version 1.0
 ************/
import java.util.Scanner;
public class BandTest{
    public static void main(String[] args){
        String name1;
        String name2;
        int i = 1;
        int j = 1;
        int x = 0;
        int z = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the name of the band booster: ");
        name1 = scan.nextLine();
        System.out.print("Please enter the name of the band booster: ");
        name2 = scan.nextLine();

        System.out.println();

        BandBooster booster1 = new BandBooster(name1);
        BandBooster booster2 = new BandBooster(name2);

        while (i < 4){
            System.out.print("Enter the number of boxes " + booster1.getName() + " sold for week "
                + i + ": ");
            x = scan.nextInt();
            booster1.updateSales(x);
            i++;
        }

        System.out.println();

        while (j < 4){
            System.out.print("Enter the number of boxes " + booster2.getName() + " sold for week "
                + j + ": ");
            z = scan.nextInt();
            booster2.updateSales(z);
            j++;
        }

        System.out.println();

        System.out.println(booster1.toString());
        System.out.println(booster2.toString());
    }
}