// ******************************************************************
// Fib.java
//
// A utility class that provide methods to compute elements of the
// Fibonacci sequence.
// ******************************************************************
public class Fib
{
    //--------------------------------------------------------------
    // Recursively computes fib(n)
    //--------------------------------------------------------------
    public static int fib1(int n)
    {
        

        if (n == 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
        else 
            return fib1(n - 1) + fib1(n - 2);

        //Fill in code -- this should look very much like the
        //mathematical specification
    }

    public static int fib2(int n) {
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else {

            for (int i = 2; i <= n; i++) {
                array[i] = array[i - 1] + array[i - 2];
                
            }
            return array[n];
        }
    }
}