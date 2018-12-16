/******************************************************************
 * @author Chibuikem Ohanele
 * @version 1.0
 * Fib.java
 * A utility class that provide methods to compute elements of the
 * Fibonacci sequence.
 ******************************************************************/
public class Fib
{
    //--------------------------------------------------------------
    // Recursively computes fib(n)
    //--------------------------------------------------------------
    public static int fib1(int n)
    {
        //System.out.println("In fib(" + n + ")");
        if(n == 0)
            return 0;
        else if (n == 1){
            return 1;
        }
        else {
            return fib1(n-1) + fib1(n-2);
        }
    }

    public static int fib2(int n)
    {
        System.out.println("In fib(" + n + ")");
        int[] x = new int[n];
        x[0] = 0;
        x[1] = 1;
        if (n > 1){
            for (int i = 2; i == x.length ; i++){
                x[i] = x[i-1] + x[i-2];
            }
            return x[n-1];
        }
        return 0;
    }
}