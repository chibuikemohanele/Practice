import java.util.Scanner;
public class FibTest
{
    public static void main(String[] args)
    {
        int n, fib;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        n = scan.nextInt();
        fib = Fib.fib2(n);
        System.out.println("Fib(" + n + ") is " + fib);
        fib = Fib.fib1(n);
        System.out.println("Fib(" + n + ") is " + fib);
    }
} 