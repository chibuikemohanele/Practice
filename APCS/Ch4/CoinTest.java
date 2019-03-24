/********************************************************************
 * @author Chibuikem Ohanele
 * CoinTest.java
 * @version 1.0
 * Finds the length of the longest run of heads in 100 flips of a coin.
 ********************************************************************/

public class CoinTest
{
    public static void main (String[] args)
    {
        System.out.println ("\f");
        final int FLIPS = 10; // number of coin flips

        int currentRun = 0; // length of the current run of HEADS
        int maxRun = 0;     // length of the maximum run so far

        Coin coin1 = new Coin();

        // Flip the coin FLIPS times
        for (int i = 0; i < FLIPS; i++)
        {
            coin1.flip();// Flip the coin & print the result
            coin1.toString();
            System.out.println (coin1);

            if (coin1.isHeads()){
                currentRun++;

                if(currentRun > maxRun){
                    maxRun = currentRun; }

            }
            else {
                currentRun = 0;
            }
        }
        System.out.println("The currentRun is: " + currentRun);
        System.out.println();
        System.out.println ("The maxRun is:" + maxRun);
        // Update the run information
    }
  // Print the results
}

