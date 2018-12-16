/**************
 * @author Chibuikem Ohanele
 * NameTest.java
 * Does Stuff with names
 * @version 1.0
 **************/
import java.util.Scanner;
public class NameTest{
    public static void main (String[] args){
        String first1, middle1, last1, first2, middle2, last2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the name of person #1 (First, Middle, Last): ");
        first1 = scan.next();
        middle1 = scan.next();
        last1 = scan.next();
        System.out.print("Please enter the name of person #2 (First, Middle, Last): ");
        first2  = scan.next();
        middle2 = scan.next();
        last2 = scan.next();

        System.out.println();

        Name name1 = new Name(first1, middle1, last1);
        Name name2 = new Name(first2, middle2, last2);

        System.out.println(name1.firstMiddleLast());
        System.out.println(name1.lastFirstMiddle());
        System.out.println(name1.initials());
        System.out.println("The name length is " + name1.length());

        System.out.println();

        System.out.println(name2.firstMiddleLast());
        System.out.println(name2.lastFirstMiddle());
        System.out.println(name2.initials());
        System.out.println("The name length is " + name2.length());
        
        System.out.println();
        
        
        if (name1.equals(name2))
            System.out.println("Both names are the same.");
        else
            System.out.println("Both names are different.");
    }
}